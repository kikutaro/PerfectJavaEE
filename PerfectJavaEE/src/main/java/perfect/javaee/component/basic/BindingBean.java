package perfect.javaee.component.basic;

import java.io.Serializable;
import javax.faces.component.html.HtmlInputText;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-3 コンポーネントの属性 サンプル用管理Bean.
 * 
 * リスト9.27 binding属性
 * 
 * @author kikuta
 */
@Named(value = "bindingBean")
@ViewScoped
public class BindingBean implements Serializable {

    @Getter @Setter
    private HtmlInputText inputTextComp;
    
    public void submit() {
        System.out.println(inputTextComp.getValue());
    }
}
