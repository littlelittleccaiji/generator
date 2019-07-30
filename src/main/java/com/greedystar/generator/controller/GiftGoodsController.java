package com.greedystar.generator.controller;

import com.greedystar.generator.entity.GiftGoods;
import com.greedystar.generator.service.GiftGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2019-07-29
 */
@RestController
@RequestMapping(value = "/giftGoods")
public class GiftGoodsController {
    @Autowired
    private GiftGoodsService giftGoodsService;


    @RequestMapping(value = {"/selectByCondition"}, method = RequestMethod.GET)
    public Object get(@RequestBody  GiftGoods giftGoods) {
        List<GiftGoods> giftGoodss = giftGoodsService.selectByCondition(giftGoods);
        return giftGoodss;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody GiftGoods giftGoods) {
        if (giftGoodsService.insert(giftGoods) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<GiftGoods> giftGoodss) {
        GiftGoods giftGoods=new GiftGoods();
        if (giftGoodsService.insertBatch(giftGoods,giftGoodss) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody GiftGoods giftGoods) {
        if (giftGoodsService.update(giftGoods) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody GiftGoods giftGoods) {
        if (giftGoodsService.delete(giftGoods) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
