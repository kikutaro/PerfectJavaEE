package perfect.javaee.parameter;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author kikuta
 */
@Named(value = "bookmarkableBean")
@RequestScoped
public class BookmarkableBean {

    @Getter @Setter
    private String param1;
    
    @Getter @Setter
    private String param2;
    
    public void exec() {
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
    }
}
