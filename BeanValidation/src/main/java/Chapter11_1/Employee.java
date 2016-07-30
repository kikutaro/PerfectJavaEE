package Chapter11_1;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * リスト11.1　Bean Validationの使い方.
 * 
 * @author kikuta
 */
public class Employee {
    
    @Min(1)
    private int number;
    
    @NotNull
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
