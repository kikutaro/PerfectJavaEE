package perfect.javaee.contracts;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-5 リソース Resource Library Contract サンプル用管理Bean.
 * 
 * リスト9.42　f:viewタグのcontracts属性
 * リスト9.43　リスト9.42に対する管理Bean
 * 
 * @author kikuta
 */
@Named(value = "resourceLibraryContractBean")
@SessionScoped
public class ResourceLibraryContractBean implements Serializable{

    @Getter @Setter
    private String contract;
    
    @PostConstruct
    public void init(){
        contract = "theme1";
    }
}
