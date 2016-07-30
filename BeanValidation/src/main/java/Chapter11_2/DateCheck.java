package Chapter11_2;

import java.util.Date;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;

/**
 * リスト11.11　@Pastと@Futureの利用例.
 * 
 * @author kikuta
 */
public class DateCheck {
    
    @Past
    private Date birthDate;
    
    @Future
    private Date deliveryDate;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
