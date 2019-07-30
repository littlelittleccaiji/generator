package ${BasePackageName}${InterfacePackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
public interface ${ClassName}Service {

    public List<${ClassName}> selectByCondition(${ClassName} ${EntityName});

    public int insert(${ClassName} ${EntityName});

    public int insertBatch(${ClassName} ${EntityName},List<${ClassName}> ${EntityName}s);

    public int update(${ClassName} ${EntityName});

    public int delete(${ClassName} ${EntityName});

}
