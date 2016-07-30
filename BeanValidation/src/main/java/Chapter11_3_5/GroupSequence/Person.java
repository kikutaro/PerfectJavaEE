package Chapter11_3_5.GroupSequence;

import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * リスト11.45　複数の制約条件を定義
 * リスト11.49　検証順序グループの指定.
 * 
 * @author kikuta
 */
public class Person {
    
    @Null
    @Size(max = 20)
    @Pattern(regexp = "[a-zA-Z]")
    private String fistName;
    
    @Null(groups = Group1.class)
    @Size(max = 3, groups = Group2.class)
    @Pattern(regexp = "[a-zA-Z]", groups = Group3.class)
    private String name;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
