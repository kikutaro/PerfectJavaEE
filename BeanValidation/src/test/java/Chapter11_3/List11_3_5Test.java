package Chapter11_3;

import Chapter11_3_5.GroupSequence.GroupOrder;
import Chapter11_3_5.GroupSequence.Person;
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
 * 11-3-5 GroupSequence.
 * 
 * @author kikuta
 */
public class List11_3_5Test {
    
    Validator validator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
    }
    
    @Test
    public void リスト11_44() {
        Person person = new Person();
        person.setFistName("taro12345678901234567890");
        
        Set<ConstraintViolation<Person>> retVal = validator.validate(person);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)3));
        
        person = new Person();
        person.setName("taro12345678901234567890");
        
        retVal = validator.validate(person, GroupOrder.class);
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
    }
}
