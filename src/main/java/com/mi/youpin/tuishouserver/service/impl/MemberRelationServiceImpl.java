package com.mi.youpin.tuishouserver.service.impl;

import com.mi.youpin.tuishouserver.mapper.MemberRelationMapper;
import com.mi.youpin.tuishouserver.entity.MemberRelation;
import com.mi.youpin.tuishouserver.service.MemberRelationService;
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
public class MemberRelationServiceImpl implements MemberRelationService {

@Autowired
private MemberRelationMapper memberRelationMapper;

public Response insert(MemberRelation memberRelation) {
    memberRelationMapper.insert(memberRelation);
    return new Response(ResultEnum.SUCCESS);
}

public Response update(MemberRelation memberRelation) {
    memberRelationMapper.update(memberRelation);
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    memberRelationMapper.delete(id);
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

    MemberRelation memberRelationCondition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), MemberRelation.class);
    MemberRelation queryCondition= memberRelationCondition==null?new MemberRelation():memberRelationCondition;
    Integer totalCount=memberRelationMapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<MemberRelation> pageData=memberRelationMapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
