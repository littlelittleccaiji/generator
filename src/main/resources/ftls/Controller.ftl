package ${BasePackageName}${ControllerPackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import ${BasePackageName}${ServicePackageName}.${ClassName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.greedystar.generator.model.Response;

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




    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response insert(@RequestBody ${ClassName} ${EntityName}) {
        return ${EntityName}Service.insert(${EntityName});
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody ${ClassName} ${EntityName}) {
        return ${EntityName}Service.update(${EntityName});
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public Response delete(@RequestParam Long id) {
         return ${EntityName}Service.delete(id) ;
    }
}
