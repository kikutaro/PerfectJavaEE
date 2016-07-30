package Chapter11_3;

import Chapter11_3_4.GroupingConstraints.Japanese;
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
 * 11-3-4 Grouping constraints.
 * 
 * @author kikuta
 */
public class List11_3_4Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_44() {
        Chapter11_3_4.GroupingConstraints.Employee emp = new Chapter11_3_4.GroupingConstraints.Employee();
        emp.setFirstName("Taro");
        emp.setMiddleName("Middle");
        emp.setLastName("Yamada");
        
        //リスト11.44　検証におけるグループの指定 
        Set<ConstraintViolation<Chapter11_3_4.GroupingConstraints.Employee>> retVal = validator.validate(emp, Japanese.class);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)1));
    }
}
