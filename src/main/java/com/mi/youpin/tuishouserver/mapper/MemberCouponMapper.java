package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.MemberCoupon;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
@Mapper
public interface MemberCouponMapper {

  Integer selectCountByCondition(MemberCoupon memberCoupon);

  List<MemberCoupon> selectByCondition(MemberCoupon memberCoupon);

  List<MemberCoupon> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("memberCoupon") MemberCoupon memberCoupon);

  int insert(@Param("memberCoupon")MemberCoupon memberCoupon);

  int insertBatch(@Param("memberCoupon")MemberCoupon memberCoupon,@Param("list")List<MemberCoupon> list);

  int update(MemberCoupon memberCoupon);

  int delete(Long id);

}
