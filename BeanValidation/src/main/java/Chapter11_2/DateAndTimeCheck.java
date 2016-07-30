package Chapter11_2;

import java.time.ZonedDateTime;
import javax.validation.constraints.Future;

/**
 * リスト11.12　Date and Time APIの利用.
 * 
 * @author kikuta
 */
public class DateAndTimeCheck {
    
    @Future
    private ZonedDateTime deliveryDate;

    public ZonedDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(ZonedDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
