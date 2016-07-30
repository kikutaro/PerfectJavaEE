package perfect.javaee.phase;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "checkTargetBean")
@ViewScoped
public class CheckTargetBean implements Serializable {

    @Getter @Setter
    private String value;
    
    public void submit() {
        System.out.println("Called CheckTargetBean submit method.");
    }
}
