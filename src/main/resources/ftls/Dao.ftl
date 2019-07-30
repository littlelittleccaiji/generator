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
public interface ${ClassName}Dao {

  List<${ClassName}> selectByCondition(${ClassName} ${EntityName});

  int insert(@Param("${EntityName}")${ClassName} ${EntityName});

  int insertBatch(@Param("${EntityName}")${ClassName} ${EntityName},@Param("list")List<${ClassName}> list);

  int update(${ClassName} ${EntityName});

  int delete(${ClassName} ${EntityName});

}
