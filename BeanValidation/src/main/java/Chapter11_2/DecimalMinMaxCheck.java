package Chapter11_2;

import java.math.BigDecimal;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

/**
 * リスト11.9　@DecimalMin、@DecimalMaxの利用例.
 * 
 * @author kikuta
 */
public class DecimalMinMaxCheck {
    
    @DecimalMin(value = "5", inclusive = false)
    private int intVal;
    
    @DecimalMax(value = "42.195", inclusive = false)
    private  BigDecimal bdVal;

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
