package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
@Mapper
public interface MerchantMapper {

  Integer selectCountByCondition(Merchant merchant);

  List<Merchant> selectByCondition(Merchant merchant);

  List<Merchant> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("merchant") Merchant merchant);

  int insert(@Param("merchant")Merchant merchant);

  int insertBatch(@Param("merchant")Merchant merchant,@Param("list")List<Merchant> list);

  int update(Merchant merchant);

  int delete(Long id);

}
