package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.RobotSeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2021-02-04
 */
@Mapper
public interface RobotSealMapper {

  Integer selectCountByCondition(RobotSeal robotSeal);

  List<RobotSeal> selectByCondition(RobotSeal robotSeal);

  List<RobotSeal> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("robotSeal") RobotSeal robotSeal);

  int insert(@Param("robotSeal")RobotSeal robotSeal);

  int insertBatch(@Param("robotSeal")RobotSeal robotSeal,@Param("list")List<RobotSeal> list);

  int update(RobotSeal robotSeal);

  int delete(Long id);

}
