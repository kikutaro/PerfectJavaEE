package perfect.javaee.component.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * 9-2-1 HTMLタグライブラリ サンプル用従業員クラス.
 * 
 * リスト9.11　h:dataTableの利用例
 * リスト9.13　従業員クラス
 * 
 * @author kikuta
 */
@Getter @Setter
public class Employee {
    
    private int id;
    private String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Employee(String name) {
        this.name = name;
    }
}
