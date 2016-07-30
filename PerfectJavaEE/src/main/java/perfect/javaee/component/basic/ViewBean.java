package perfect.javaee.component.basic;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.30　rendered属性に条件を指定する
 * 
 * @author kikuta
 */
@Named(value = "viewBean")
@ViewScoped
public class ViewBean implements Serializable {
    
    @Getter @Setter
    private boolean flg;
    
    @PostConstruct
    public void init() {
        flg = false;
    }
}
