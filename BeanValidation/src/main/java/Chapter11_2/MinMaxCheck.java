package Chapter11_2;

import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * リスト11.8　@Min、@Maxの利用例.
 * 
 * @author kikuta
 */
public class MinMaxCheck {
    
    @Min(10)
    private int intVal;
    
    @Max(100)
    private BigDecimal bdVal;

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public BigDecimal getBdVal() {
        return bdVal;
    }

    public void setBdVal(BigDecimal bdVal) {
        this.bdVal = bdVal;
    }

}
