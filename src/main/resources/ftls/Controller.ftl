package ${BasePackageName}${ControllerPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ServicePackageName}.${ClassName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
@RestController
@RequestMapping(value = "/${EntityName}")
public class ${ClassName}Controller {
    @Autowired
    private ${ClassName}Service ${EntityName}Service;


    @RequestMapping(value = {"/selectByCondition"}, method = RequestMethod.GET)
    public Object get(@RequestBody  ${ClassName} ${EntityName}) {
        List<${ClassName}> ${EntityName}s = ${EntityName}Service.selectByCondition(${EntityName});
        return ${EntityName}s;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.insert(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<${ClassName}> ${EntityName}s) {
        ${ClassName} ${EntityName}=new ${ClassName}();
        if (${EntityName}Service.insertBatch(${EntityName},${EntityName}s) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.update(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody ${ClassName} ${EntityName}) {
        if (${EntityName}Service.delete(${EntityName}) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
