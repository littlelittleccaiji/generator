package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.MemberRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
@Mapper
public interface MemberRelationMapper {

  Integer selectCountByCondition(MemberRelation memberRelation);

  List<MemberRelation> selectByCondition(MemberRelation memberRelation);

  List<MemberRelation> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("memberRelation") MemberRelation memberRelation);

  int insert(@Param("memberRelation")MemberRelation memberRelation);

  int insertBatch(@Param("memberRelation")MemberRelation memberRelation,@Param("list")List<MemberRelation> list);

  int update(MemberRelation memberRelation);

  int delete(Long id);

}
