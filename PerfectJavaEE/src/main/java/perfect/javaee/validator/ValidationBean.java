package perfect.javaee.validator;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "validationBean")
@RequestScoped
public class ValidationBean {
    
    @Getter @Setter
    private String txtInput;
    
    @Getter @Setter
    private String txtAreaInput;

    @Getter @Setter
    private String id;
    
    @Getter @Setter
    private String length;

    public void out() {
        System.out.println(id);
    }
    
    public void outLength() {
        System.out.println(length);
    }
}
