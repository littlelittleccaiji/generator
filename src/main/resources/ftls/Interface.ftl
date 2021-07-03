package ${BasePackageName}${InterfacePackageName};

import ${BasePackageName}${EntityPackageName}.${ClassName};
import com.greedystar.generator.model.Response;

import java.util.List;

/**
 * Author ${Author}
 * Date  ${Date}
 */
public interface ${ClassName}Service {

    public Response insert(${ClassName} ${EntityName});

    public Response update(${ClassName} ${EntityName});

    public Response delete(Long id);

}
