package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.RobotSeal;
import com.mi.youpin.tuishouserver.service.RobotSealService;
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
@RequestMapping(value = "/robotSeal")
public class RobotSealController {
    @Autowired
    private RobotSealService robotSealService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody RobotSeal robotSeal) {
        return robotSealService.insert(robotSeal);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody RobotSeal robotSeal) {
        return robotSealService.update(robotSeal);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return robotSealService.delete(id) ;
    }
}
