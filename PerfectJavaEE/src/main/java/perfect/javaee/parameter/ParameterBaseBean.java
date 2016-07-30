package perfect.javaee.parameter;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "parameterBaseBean")
@ViewScoped
public class ParameterBaseBean implements Serializable {

    @Inject
    private Parameter param;
    
    @Getter @Setter
    private String value;
    
    public String move() {
        param.setValue(value);
        return "nextWithSessionScoped.xhtml";
    }
}
