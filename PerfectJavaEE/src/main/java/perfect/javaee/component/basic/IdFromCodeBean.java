package perfect.javaee.component.basic;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.context.FacesContext;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.23　idを利用したコンポーネントのオブジェクト取得
 * 
 * @author kikuta
 */
@Named(value = "idFromCodeBean")
@RequestScoped
public class IdFromCodeBean {
    
    public void findLabelComponent() {
        UIComponent lbl = FacesContext.getCurrentInstance().getViewRoot().findComponent("lbl");
        if (lbl != null && lbl instanceof HtmlOutputLabel) {
            System.out.println(((HtmlOutputLabel)lbl).getValue());
        }
    }
}
