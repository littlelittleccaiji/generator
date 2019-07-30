package com.greedystar.generator.service.impl;

import com.greedystar.generator.dao.GiftGoodsDao;
import com.greedystar.generator.entity.GiftGoods;
import com.greedystar.generator.service.GiftGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Author zhanghaitao
* Date  2019-07-29
*/
@Service
public class GiftGoodsServiceImpl implements GiftGoodsService {
@Autowired
private GiftGoodsDao giftGoodsDao;

    @Override
public List<GiftGoods> selectByCondition(GiftGoods giftGoods){
return giftGoodsDao.selectByCondition(giftGoods);
}


    @Override
public int insert(GiftGoods giftGoods) {
return giftGoodsDao.insert(giftGoods);
}

    @Override
public int insertBatch(GiftGoods giftGoods,List<GiftGoods> giftGoodss){
return giftGoodsDao.insertBatch(giftGoods,giftGoodss);
}

    @Override
public int update(GiftGoods giftGoods) {
return giftGoodsDao.update(giftGoods);
}

    @Override
public int delete(GiftGoods giftGoods) {
return giftGoodsDao.delete(giftGoods);
}

}
