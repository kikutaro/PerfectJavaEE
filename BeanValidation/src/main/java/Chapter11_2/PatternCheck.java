package Chapter11_2;

import javax.validation.constraints.Pattern;

/**
 * リスト11.13　@Pattern.
 * 
 * @author kikuta
 */
public class PatternCheck {
    
    @Pattern(regexp = "[a-zA-Z]")
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
