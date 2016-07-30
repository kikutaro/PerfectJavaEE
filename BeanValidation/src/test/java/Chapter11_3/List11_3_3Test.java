package Chapter11_3;

import Chapter11_3_3.ConstraintComposition.User;
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
 * 11-3-3 Constraint Composition.
 * 
 * @author kikuta
 */
public class List11_3_3Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_37() {
        User user = new User();
        user.setPassword("mypass");
        
        Set<ConstraintViolation<User>> retVal = validator.validate(user);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)2));
    }
}
