package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.RobotSeal;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
public interface RobotSealService {

    public Response insert(RobotSeal robotSeal);

    public Response update(RobotSeal robotSeal);

    public Response delete(Long id);

}
