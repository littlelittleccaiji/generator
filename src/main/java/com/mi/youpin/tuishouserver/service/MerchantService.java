package com.mi.youpin.tuishouserver.service;

import com.mi.youpin.tuishouserver.entity.Merchant;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
public interface MerchantService {

    public Response insert(Merchant merchant);

    public Response update(Merchant merchant);

    public Response delete(Long id);

}
