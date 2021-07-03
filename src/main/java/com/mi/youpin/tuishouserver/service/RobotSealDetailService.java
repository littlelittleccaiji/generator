package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.RobotSealDetail;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
public interface RobotSealDetailService {

    public Response insert(RobotSealDetail robotSealDetail);

    public Response update(RobotSealDetail robotSealDetail);

    public Response delete(Long id);

}
