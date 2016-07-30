package Chapter11_2;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * リスト11.5　@Null、@NotNullの利用例.
 * 
 * @author kikuta
 */
public class NullCheck {
    
    @Null
    private String str;
    
    @NotNull
    private Integer age;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    
}
