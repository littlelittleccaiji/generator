package com.mi.youpin.tuishouserver.service.impl;

import com.mi.youpin.tuishouserver.mapper.MemberCouponMapper;
import com.mi.youpin.tuishouserver.entity.MemberCoupon;
import com.mi.youpin.tuishouserver.service.MemberCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.greedystar.generator.common.BusinessException;
import com.greedystar.generator.common.CommonConstant;
import com.greedystar.generator.common.ResultEnum;
import com.greedystar.generator.model.PageQueryRequest;
import com.greedystar.generator.model.PageResult;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
* Author zhanghaitao
* Date  2020-12-29
*/
@Service
public class MemberCouponServiceImpl implements MemberCouponService {

@Autowired
private MemberCouponMapper memberCouponMapper;

public Response insert(MemberCoupon memberCoupon) {
    memberCouponMapper.insert(memberCoupon);
    return new Response(ResultEnum.SUCCESS);
}

public Response update(MemberCoupon memberCoupon) {
    memberCouponMapper.update(memberCoupon);
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    memberCouponMapper.delete(id);
    return new Response(ResultEnum.SUCCESS);
}
public PageResult pageQuery(PageQueryRequest pageQueryRequest){
    if (pageQueryRequest.getPageNo() == null || pageQueryRequest.getPageSize() == null) {
        throw new BusinessException(ResultEnum.PARAM_ERROR);
        }
    if (pageQueryRequest.getPageNo() > CommonConstant.MAX_QUERY_NUM) {
            throw new BusinessException(ResultEnum.QUERY_NUM_ERROR);
        }
    int pageNo = pageQueryRequest.getPageNo();
    int pageSize = pageQueryRequest.getPageSize();

    MemberCoupon memberCouponCondition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), MemberCoupon.class);
    MemberCoupon queryCondition= memberCouponCondition==null?new MemberCoupon():memberCouponCondition;
    Integer totalCount=memberCouponMapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<MemberCoupon> pageData=memberCouponMapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
