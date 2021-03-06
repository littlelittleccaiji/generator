package ${BasePackageName}${ServicePackageName};

import ${BasePackageName}${DaoPackageName}.${ClassName}Mapper;
import ${BasePackageName}${EntityPackageName}.${ClassName};
${InterfaceImport}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.greedystar.generator.common.BusinessException;
import com.greedystar.generator.common.CommonConstant;
import com.greedystar.generator.common.ResultEnum;
import com.greedystar.generator.model.PageQueryRequest;
import com.greedystar.generator.model.PageResult;
import com.greedystar.generator.model.Response;

import java.util.List;

/**
* Author ${Author}
* Date  ${Date}
*/
@Service
public class ${ClassName}Service${Impl} {

@Autowired
private ${ClassName}Mapper ${EntityName}Mapper;

public Response insert(${ClassName} ${EntityName}) {
    ${EntityName}Mapper.insert(${EntityName});
    return new Response(ResultEnum.SUCCESS);
}

public Response update(${ClassName} ${EntityName}) {
    ${EntityName}Mapper.update(${EntityName});
    return new Response(ResultEnum.SUCCESS);
}
public Response delete(Long id) {
    ${EntityName}Mapper.delete(id);
    return new Response(ResultEnum.SUCCESS);
}
public PageResult pageQuery(PageQueryRequest pageQueryRequest){
    if (pageQueryRequest.getPageNo() == null || pageQueryRequest.getPageSize() == null) {
        throw new BusinessException(ResultEnum.PARAM_ERROR);
        }
    if (pageQueryRequest.getPageNo() > CommonConstant.MAX_QUERY_NUM) {
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
