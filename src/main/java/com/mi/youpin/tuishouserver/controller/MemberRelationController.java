package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.MemberRelation;
import com.mi.youpin.tuishouserver.service.MemberRelationService;
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
@RequestMapping(value = "/memberRelation")
public class MemberRelationController {
    @Autowired
    private MemberRelationService memberRelationService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody MemberRelation memberRelation) {
        return memberRelationService.insert(memberRelation);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody MemberRelation memberRelation) {
        return memberRelationService.update(memberRelation);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return memberRelationService.delete(id) ;
    }
}
