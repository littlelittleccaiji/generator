package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.MemberCoupon;
import com.mi.youpin.tuishouserver.service.MemberCouponService;
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
@RequestMapping(value = "/memberCoupon")
public class MemberCouponController {
    @Autowired
    private MemberCouponService memberCouponService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody MemberCoupon memberCoupon) {
        return memberCouponService.insert(memberCoupon);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody MemberCoupon memberCoupon) {
        return memberCouponService.update(memberCoupon);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return memberCouponService.delete(id) ;
    }

}
