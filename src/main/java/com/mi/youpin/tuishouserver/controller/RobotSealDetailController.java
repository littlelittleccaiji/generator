package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.RobotSealDetail;
import com.mi.youpin.tuishouserver.service.RobotSealDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
@RestController
@RequestMapping(value = "/robotSealDetail")
public class RobotSealDetailController {
    @Autowired
    private RobotSealDetailService robotSealDetailService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody RobotSealDetail robotSealDetail) {
        return robotSealDetailService.insert(robotSealDetail);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody RobotSealDetail robotSealDetail) {
        return robotSealDetailService.update(robotSealDetail);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return robotSealDetailService.delete(id) ;
    }
}
