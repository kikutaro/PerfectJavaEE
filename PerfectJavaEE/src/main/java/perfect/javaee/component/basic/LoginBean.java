package perfect.javaee.component.basic;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.16　h:panelGridの利用例
 * 
 * @author kikuta
 */
@Named(value = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

    @Getter @Setter
    private String id;
    
    @Getter @Setter
    private String pswd;
}
