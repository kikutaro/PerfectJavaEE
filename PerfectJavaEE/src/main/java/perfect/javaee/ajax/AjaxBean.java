package perfect.javaee.ajax;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 10-1 Ajax（Asynchronous JavaScript + XML）サンプル用管理Bean.
 * 
 * リスト10.1　テキストへ入力した文字を並行してラベルへ表示
 * 
 * @author kikuta
 */
@Named(value = "ajaxBean")
@ViewScoped
public class AjaxBean implements Serializable {

    @Getter @Setter
    private String str;
}
