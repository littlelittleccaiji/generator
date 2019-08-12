package ${BasePackageName}${ServicePackageName};

import ${BasePackageName}${DaoPackageName}.${ClassName}Mapper;
import ${BasePackageName}${EntityPackageName}.${ClassName};
${InterfaceImport}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Author ${Author}
* Date  ${Date}
*/
@Service
public class ${ClassName}Service${Impl} {

@Autowired
private ${ClassName}Mapper ${EntityName}Mapper;
${Override}
public List<${ClassName}> selectByCondition(${ClassName} ${EntityName}){
return ${EntityName}Mapper.selectByCondition(${EntityName});
}

public int insert(${ClassName} ${EntityName}) {
return ${EntityName}Mapper.insert(${EntityName});
}
public int insertBatch(${ClassName} ${EntityName},List<${ClassName}> ${EntityName}s){
return ${EntityName}Mapper.insertBatch(${EntityName},${EntityName}s);
}
public int update(${ClassName} ${EntityName}) {
return ${EntityName}Mapper.update(${EntityName});
}
public int delete(${ClassName} ${EntityName}) {
return ${EntityName}Mapper.delete(${EntityName});
}
public PageResult pageQuery(PageQueryRequest pageQueryRequest){
    if (pageQueryRequest.getPageNo() == null || pageQueryRequest.getPageSize() == null) {
        throw new BusinessException(ResultEnum.PARAM_ERROR);
        }
    if (pageQueryRequest.getPageNo() > CommonConstants.MAX_QUERY_NUM) {
            throw new BusinessException(ResultEnum.QUERY_NUM_ERROR);
        }
    int pageNo = pageQueryRequest.getPageNo();
    int pageSize = pageQueryRequest.getPageSize();

    ${ClassName} ${EntityName}Condition= JSONObject.toJavaObject(pageQueryRequest.getQueryCondition(), ${ClassName}.class);
    ${ClassName} queryCondition= ${EntityName}Condition==null?new ${ClassName}():${EntityName}Condition;
    Integer totalCount=${EntityName}Mapper.selectCountByCondition(queryCondition);
        if(totalCount<1){
        throw new BusinessException(ResultEnum.NO_DATA);
    }
    List<${ClassName}> pageData=${EntityName}Mapper.pageQuery((pageNo - 1) * pageSize, pageSize,queryCondition);
    PageResult result = new PageResult(pageQueryRequest.getPageSize(), pageQueryRequest.getPageNo());
    result.setTotal(totalCount);
    result.setData(pageData);
    return result;
    }
}
