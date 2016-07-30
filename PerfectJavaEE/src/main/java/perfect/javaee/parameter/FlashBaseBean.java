package perfect.javaee.parameter;

import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "flashBaseBean")
@ViewScoped
public class FlashBaseBean implements Serializable {

    @Getter @Setter
    private String value;
    
    public String move() {
        FacesContext.getCurrentInstance().getExternalContext().getFlash().put("val", value);
        return "nextWithFlash.xhtml";
    }
}
