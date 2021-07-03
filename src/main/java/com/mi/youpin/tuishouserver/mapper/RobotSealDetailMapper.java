package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.RobotSealDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
@Mapper
public interface RobotSealDetailMapper {

  Integer selectCountByCondition(RobotSealDetail robotSealDetail);

  List<RobotSealDetail> selectByCondition(RobotSealDetail robotSealDetail);

  List<RobotSealDetail> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("robotSealDetail") RobotSealDetail robotSealDetail);

  int insert(@Param("robotSealDetail")RobotSealDetail robotSealDetail);

  int insertBatch(@Param("robotSealDetail")RobotSealDetail robotSealDetail,@Param("list")List<RobotSealDetail> list);

  int update(RobotSealDetail robotSealDetail);

  int delete(Long id);

}
