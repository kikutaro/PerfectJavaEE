package Chapter11_2;

import java.math.BigDecimal;
import javax.validation.constraints.Digits;

/**
 * リスト11.10　@Digitsの利用例.
 * 
 * @author kikuta
 */
public class DigitsCheck {
    
    @Digits(integer = 3, fraction = 2)
    private BigDecimal checkDigits;

    public BigDecimal getCheckDigits() {
        return checkDigits;
    }

    public void setCheckDigits(BigDecimal checkDigits) {
        this.checkDigits = checkDigits;
    }
}
