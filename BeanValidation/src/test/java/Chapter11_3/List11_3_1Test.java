package Chapter11_3;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;

/**
 * 11-3-1 Custom Constraints.
 * 
 * リスト11.29　@CheckEmployeeRankの検証実行
 * リスト11.30～33の検証実行
 * 
 * @author kikuta
 */
public class List11_3_1Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_29() {
        Chapter11_3_1.CustomConstraint.List25_29.Employee emp = new Chapter11_3_1.CustomConstraint.List25_29.Employee();
        emp.setRank(5);
        emp.setRole(Chapter11_3_1.CustomConstraint.List25_29.Role.NONE);
        
        Set<ConstraintViolation<Chapter11_3_1.CustomConstraint.List25_29.Employee>> vRetVal = validator.validate(emp);
        
        vRetVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRetVal.stream().count(), is((long)1));
    }
    
    @Test
    public void リスト11_30_33() {
        Chapter11_3_1.CustomConstraint.List30_34.Employee emp = new Chapter11_3_1.CustomConstraint.List30_34.Employee();
        emp.setRank(3);
        emp.setRole(Chapter11_3_1.CustomConstraint.List30_34.Role.NONE);
        
        Set<ConstraintViolation<Chapter11_3_1.CustomConstraint.List30_34.Employee>> vRetVal = validator.validate(emp);
        
        vRetVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRetVal.stream().count(), is((long)1));
    }
}
