package Chapter11_3;

import Chapter11_3_6.MultiValuedConstraint.Admin;
import Chapter11_3_6.MultiValuedConstraint.User;
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
 * 11-3-6　 Multi-valued constraint.
 * 
 * @author kikuta
 */
public class List11_3_6Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_50() {
        Chapter11_3_6.MultiValuedConstraint.Employee emp = new Chapter11_3_6.MultiValuedConstraint.Employee();
        emp.setPeriod(0);
        
        Set<ConstraintViolation<Chapter11_3_6.MultiValuedConstraint.Employee>> retVal = validator.validate(emp, Admin.class);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)1));
        
        emp = new Chapter11_3_6.MultiValuedConstraint.Employee();
        emp.setPeriod(-1);
        
        retVal = validator.validate(emp, User.class);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)1));
    }
}
