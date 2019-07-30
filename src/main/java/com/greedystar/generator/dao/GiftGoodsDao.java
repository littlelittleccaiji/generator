package com.greedystar.generator.dao;

import com.greedystar.generator.entity.GiftGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2019-07-29
 */
@Mapper
public interface GiftGoodsDao {

  List<GiftGoods> selectByCondition(GiftGoods giftGoods);

  int insert(@Param("giftGoods")GiftGoods giftGoods);

  int insertBatch(@Param("giftGoods")GiftGoods giftGoods,@Param("list")List<GiftGoods> list);

  int update(GiftGoods giftGoods);

  int delete(GiftGoods giftGoods);

}
