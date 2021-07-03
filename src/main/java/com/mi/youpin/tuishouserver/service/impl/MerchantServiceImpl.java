package com.mi.youpin.tuishouserver.service.impl;

import com.mi.youpin.tuishouserver.mapper.MerchantMapper;
import com.mi.youpin.tuishouserver.entity.Merchant;
import com.mi.youpin.tuishouserver.service.MerchantService;
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
public class MerchantServiceImpl implements MerchantService {

@Autowired
private MerchantMapper merchantMapper;

public Response insert(Merchant merchant) {
    merchantMapper.insert(merchant);
    return new Response(ResultEnum.SUCCESS);
}

public Response update(Merchant merchant) {
    merchantMapper.update(merchant);
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    merchantMapper.delete(id);
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

    Merchant merchantCondition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), Merchant.class);
    Merchant queryCondition= merchantCondition==null?new Merchant():merchantCondition;
    Integer totalCount=merchantMapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<Merchant> pageData=merchantMapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
