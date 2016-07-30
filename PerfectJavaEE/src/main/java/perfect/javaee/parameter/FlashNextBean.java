package perfect.javaee.parameter;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "flashNextBean")
@ViewScoped
public class FlashNextBean implements Serializable {
    
    @Getter @Setter
    private String fromBaseBeanValue;
    
    @PostConstruct
    public void init() {
        fromBaseBeanValue = (String) FacesContext.getCurrentInstance().getExternalContext().getFlash().get("val");
    }
    
}
