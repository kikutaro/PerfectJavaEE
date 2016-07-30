package Chapter11_3;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.executable.ExecutableValidator;
import org.junit.Before;
import Chapter11_3_7.CrossParameterConstraints.Employee;
import static org.hamcrest.CoreMatchers.is;

/**
 * 11-3-7 Cross-Parameter Constraints.
 * 
 * @author kikuta
 */
public class List11_3_7Test {
    
    Validator validator;
    
    ExecutableValidator eValidator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
        eValidator = validator.forExecutables();
    }
    
    @Test
    public void リスト11_51_52() throws NoSuchMethodException {
        Employee emp = new Employee();
        Calendar startCal = Calendar.getInstance();
        startCal.set(Calendar.YEAR, 2016);
        startCal.add(Calendar.MONTH, 7);
        startCal.add(Calendar.DATE, 26);
        Calendar endCal = Calendar.getInstance();
        endCal.set(Calendar.YEAR, 2016);
        endCal.add(Calendar.MONTH, 2);
        endCal.add(Calendar.DATE, 22);
        emp.joinCompany(startCal.getTime(), endCal.getTime());
        
        Method method = Employee.class.getMethod("joinCompany", Date.class, Date.class);
        Set<ConstraintViolation<Employee>> retVal 
                = eValidator.validateParameters(emp, method, new Object[] {startCal.getTime(), endCal.getTime()});
        
        retVal.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(retVal.stream().count(), is((long)1));
    }
}
