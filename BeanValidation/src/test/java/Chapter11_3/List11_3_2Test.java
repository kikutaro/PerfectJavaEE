package Chapter11_3;

import Chapter11_3_2.ObjectGraphValidation.Parent;
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
 * 11-3-2 Object graph validation.
 * 
 * リスト11.37　Parentオブジェクトの検証
 * 
 * @author kikuta
 */
public class List11_3_2Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_37() {
        Parent p = new Parent();
        p.createChildren();
        
        Set<ConstraintViolation<Parent>> retVal = validator.validate(p);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)1));
    }
}
