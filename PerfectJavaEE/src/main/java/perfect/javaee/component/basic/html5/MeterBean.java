package perfect.javaee.component.basic.html5;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * 9-2-4 HTML5への対応 サンプル用管理Bean.
 * 
 * リスト9.36　Pass-through Elementsでmeterを利用する例
 * 
 * @author kikuta
 */
@Named(value = "meterBean")
@ViewScoped
public class MeterBean implements Serializable {
    
    private int val;
    
    @PostConstruct
    public void init() {
        val = 50;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
