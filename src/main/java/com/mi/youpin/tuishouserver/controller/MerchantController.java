package com.mi.youpin.tuishouserver.controller;

import com.mi.youpin.tuishouserver.entity.Merchant;
import com.mi.youpin.tuishouserver.service.MerchantService;
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
@RequestMapping(value = "/merchant")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody Merchant merchant) {
        return merchantService.insert(merchant);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody Merchant merchant) {
        return merchantService.update(merchant);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return merchantService.delete(id) ;
    }
}
