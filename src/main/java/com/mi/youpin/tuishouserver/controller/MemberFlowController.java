package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.MemberFlow;
import com.mi.youpin.tuishouserver.service.MemberFlowService;
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
 * Date  2020-12-29
 */
@RestController
@RequestMapping(value = "/memberFlow")
public class MemberFlowController {
    @Autowired
    private MemberFlowService memberFlowService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody MemberFlow memberFlow) {
        return memberFlowService.insert(memberFlow);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody MemberFlow memberFlow) {
        return memberFlowService.update(memberFlow);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return memberFlowService.delete(id) ;
    }
}
