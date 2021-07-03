package com.mi.youpin.tuishouserver.mapper;

import com.mi.youpin.tuishouserver.entity.MemberFlow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author zhanghaitao
 * Date  2020-12-29
 */
@Mapper
public interface MemberFlowMapper {

  Integer selectCountByCondition(MemberFlow memberFlow);

  List<MemberFlow> selectByCondition(MemberFlow memberFlow);

  List<MemberFlow> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("memberFlow") MemberFlow memberFlow);

  int insert(@Param("memberFlow")MemberFlow memberFlow);

  int insertBatch(@Param("memberFlow")MemberFlow memberFlow,@Param("list")List<MemberFlow> list);

  int update(MemberFlow memberFlow);

  int delete(Long id);

}
