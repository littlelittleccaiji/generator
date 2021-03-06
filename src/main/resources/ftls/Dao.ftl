package ${BasePackageName}${DaoPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@Mapper
public interface ${ClassName}Mapper {

  Integer selectCountByCondition(${ClassName} ${EntityName});

  List<${ClassName}> selectByCondition(${ClassName} ${EntityName});

  List<${ClassName}> pageQuery(@Param("startIndex") Integer startIndex, @Param("pageSize") Integer pageSize,@Param("${EntityName}") ${ClassName} ${EntityName});

  int insert(@Param("${EntityName}")${ClassName} ${EntityName});

  int insertBatch(@Param("${EntityName}")${ClassName} ${EntityName},@Param("list")List<${ClassName}> list);

  int update(${ClassName} ${EntityName});

  int delete(Long id);

}
