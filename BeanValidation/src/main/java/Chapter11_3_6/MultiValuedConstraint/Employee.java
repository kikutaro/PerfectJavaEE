package Chapter11_3_6.MultiValuedConstraint;

import javax.validation.constraints.Min;

/**
 * リスト11.50　Multi-valued constraint.
 * 
 * @author kikuta
 */
public class Employee {
    @Min.List( {
        @Min(value = 1, groups = Admin.class,
                message =""),
        @Min(value = 0, groups = User.class)
    })
    private int period;

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
