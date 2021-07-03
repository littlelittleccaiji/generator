package com.mi.youpin.tuishouserver.service.impl;

import com.mi.youpin.tuishouserver.mapper.RobotSealMapper;
import com.mi.youpin.tuishouserver.entity.RobotSeal;
import com.mi.youpin.tuishouserver.service.RobotSealService;
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
public class RobotSealServiceImpl implements RobotSealService {

@Autowired
private RobotSealMapper robotSealMapper;

public Response insert(RobotSeal robotSeal) {
    robotSealMapper.insert(robotSeal);
    return new Response(ResultEnum.SUCCESS);
}

public Response update(RobotSeal robotSeal) {
    robotSealMapper.update(robotSeal);
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    robotSealMapper.delete(id);
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

    RobotSeal robotSealCondition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), RobotSeal.class);
    RobotSeal queryCondition= robotSealCondition==null?new RobotSeal():robotSealCondition;
    Integer totalCount=robotSealMapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<RobotSeal> pageData=robotSealMapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
