package perfect.javaee.parameter;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import lombok.Getter;

/**
 *
 * @author kikuta
 */
@Named(value = "parameterNextBean")
@ViewScoped
public class ParameterNextBean implements Serializable {

    @Inject
    @Getter
    private Parameter param;
    
    @PostConstruct
    public void init() {
        if(param != null) {
            System.out.println(param.getValue());
        }
    }
}
