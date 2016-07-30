package perfect.javaee.ajax;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 10-1 Ajax（Asynchronous JavaScript + XML）サンプル用管理Bean.
 * 
 * リスト10.2　f:ajaxタグでコンポーネントを挟む例
 * 
 * @author kikuta
 */
@Named(value = "ajaxGroupBean")
@ViewScoped
public class AjaxGroupBean implements Serializable {

    @Getter @Setter
    private String val1;
    
    @Getter @Setter
    private String val2;
    
    @Getter @Setter
    private String ret;
    
    public void concat() {
        ret = val1.concat(val2);
    }
}
