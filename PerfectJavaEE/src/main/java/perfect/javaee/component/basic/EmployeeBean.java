package perfect.javaee.component.basic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用管理Bean.
 * 
 * リスト9.11　h:dataTableの利用例
 * リスト9.12　リスト9.11で利用している管理Bean
 * 
 * @author kikuta
 */
@Named(value = "employeeBean")
@ViewScoped
public class EmployeeBean implements Serializable {

    @Getter @Setter
    private List<Employee> listEmp;
    
    @Getter @Setter
    private int code; //社員コード
    
    @Getter @Setter
    private String name; //社員名
    
    @Getter @Setter
    private Employee emp;
    
    @PostConstruct
    public void init() {
        listEmp = Arrays.asList(
                new Employee(1, "山田太郎"),
                new Employee(2, "山田花子")
        );
    }
    
    public void codeToName() {
        name = listEmp.stream()
            .filter(e -> e.getId() == code)
            .findFirst()
            .orElse(new Employee(0, "該当なし"))
            .getName();
    }
    
    public void submit() {
        if(emp != null) {
            System.out.println(emp.getName());
        }
    }
}
