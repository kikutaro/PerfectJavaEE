package perfect.javaee.component.basic.html5;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-4 HTML5への対応 サンプル用管理Bean.
 * 
 * リスト9.32　メール形式のテキストボックス
 * リスト9.33　色の選択を行うテキストボックス
 * リスト9.34　f:passThroughAttributesタグの利用
 * リスト9.35　リスト9.34のvalue属性で指定するMap
 * 
 * @author kikuta
 */
@Named(value = "html5Bean")
@RequestScoped
public class Html5Bean {

    @Getter @Setter
    private String email;
    
    @Getter @Setter
    private String color;
    
    @Getter @Setter
    private String val;
    
    @Getter @Setter
    private Map<String, String> valMap;
    
    @PostConstruct
    public void init() {
        valMap = new HashMap<>();
        valMap.put("type", "number");
        valMap.put("min", "10");
        valMap.put("max", "99");
    }
    
    public void submit() {
        
    }
} 
