package com.mi.youpin.tuishouserver.service.impl;

import com.mi.youpin.tuishouserver.mapper.RobotSealDetailMapper;
import com.mi.youpin.tuishouserver.entity.RobotSealDetail;
import com.mi.youpin.tuishouserver.service.RobotSealDetailService;
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
* Date  2021-02-04
*/
@Service
public class RobotSealDetailServiceImpl implements RobotSealDetailService {

@Autowired
private RobotSealDetailMapper robotSealDetailMapper;

public Response insert(RobotSealDetail robotSealDetail) {
    robotSealDetailMapper.insert(robotSealDetail);
    return new Response(ResultEnum.SUCCESS);
}

public Response update(RobotSealDetail robotSealDetail) {
    robotSealDetailMapper.update(robotSealDetail);
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    robotSealDetailMapper.delete(id);
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

    RobotSealDetail robotSealDetailCondition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), RobotSealDetail.class);
    RobotSealDetail queryCondition= robotSealDetailCondition==null?new RobotSealDetail():robotSealDetailCondition;
    Integer totalCount=robotSealDetailMapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<RobotSealDetail> pageData=robotSealDetailMapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
