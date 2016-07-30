package Chapter11_3_4.GroupingConstraints;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * リスト11.42　リスト11.41に対してgroupsを指定した場合.
 * 
 * リスト11.41　groupsを利用していない定義 から変更済
 * 
 * @author kikuta
 */
public class Employee {
    @NotNull
    private String firstName;
    
    @Null(groups = Japanese.class, message = "日本人にミドルネームはつきません。")
    private String middleName;
    
    @NotNull
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
