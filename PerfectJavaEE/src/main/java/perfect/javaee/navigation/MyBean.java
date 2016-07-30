package perfect.javaee.navigation;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "myBean")
@RequestScoped
public class MyBean {
    
    @Getter @Setter
    private int val;

    public String move() {
        if(val < 1000) {
            return "next.xhtml";
        }
        return "another.xhtml";
    }
}
