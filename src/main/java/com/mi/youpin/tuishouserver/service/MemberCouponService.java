package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.MemberCoupon;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
public interface MemberCouponService {

    public Response insert(MemberCoupon memberCoupon);

    public Response update(MemberCoupon memberCoupon);

    public Response delete(Long id);

}
