package com.greedystar.generator.service;

import com.greedystar.generator.entity.GiftGoods;

import java.util.List;

/**
 * Author zhanghaitao
 * Date  2019-07-29
 */
public interface GiftGoodsService {

    public List<GiftGoods> selectByCondition(GiftGoods giftGoods);

    public int insert(GiftGoods giftGoods);

    public int insertBatch(GiftGoods giftGoods,List<GiftGoods> giftGoodss);

    public int update(GiftGoods giftGoods);

    public int delete(GiftGoods giftGoods);

}
