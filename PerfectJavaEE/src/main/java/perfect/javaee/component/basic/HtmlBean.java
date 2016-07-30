package perfect.javaee.component.basic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.6　HTMLタグによるコンポーネントの定義
 * リスト9.8　h:selectOneListboxとf:selectItemの利用例
 * リスト9.9　h:selectOneMenuとf:selectItemsの利用例
 * 
 * @author kikuta
 */
@Named(value = "htmlBean")
@ViewScoped
public class HtmlBean implements Serializable {

    @Getter @Setter
    private String val;
    
    @Getter @Setter
    private String selected;
    
    @Getter @Setter
    private List<Item> listItems;
    
    @PostConstruct
    public void init() {
        selected = "val2";
        listItems = new ArrayList<>();
        createSelectOneMenuItems();
    }
    
    private void createSelectOneMenuItems() {
        listItems.add(new Item("項目1", "val1"));
        listItems.add(new Item("項目2", "val2"));
        listItems.add(new Item("項目3", "val3"));
    }
}
