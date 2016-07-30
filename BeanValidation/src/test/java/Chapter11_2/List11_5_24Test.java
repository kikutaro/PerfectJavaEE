package Chapter11_2;

import java.math.BigDecimal;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.executable.ExecutableValidator;
import org.junit.Before;
import static org.hamcrest.CoreMatchers.is;

/**
 * 11-2 Bean Validationの定義.
 * 
 * リスト11.5　@Null、@NotNullの利用例
 * リスト11.6　@AssertFalse、@AssertTrueの利用例
 * リスト11.7　@Sizeの利用例
 * リスト11.8　@Min、@Maxの利用例
 * リスト11.9　@DecimalMin、@DecimalMaxの利用例
 * リスト11.10　@Digitsの利用例
 * リスト11.11　@Pastと@Futureの利用例
 * リスト11.12　Date and Time APIの利用
 * リスト11.13　@Pattern
 * 
 * @author kikuta
 */
public class List11_5_24Test {
    
    Validator validator;
    
    ExecutableValidator eValidator;
    
    @Before
    public void setup() {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        validator = vf.getValidator();
        eValidator = validator.forExecutables();
    }
    
    @Test
    public void リスト11_5() {
        NullCheck nullCheck = new NullCheck();
        nullCheck.setStr("not null");
        nullCheck.setAge(null);
        
        Set<ConstraintViolation<NullCheck>> vRet = validator.validate(nullCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)2));
    }
    
    @Test
    public void リスト11_6() throws NoSuchMethodException {
        BooleanCheck booleanCheck = new BooleanCheck();
        Set<ConstraintViolation<BooleanCheck>> vRet 
                = eValidator.validateReturnValue(booleanCheck, BooleanCheck.class.getMethod("turnOnStateActivated"), booleanCheck.turnOnStateActivated());
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)1));
    }
    
    @Test
    public void リスト11_7() {
        SizeCheck sizeCheck = new SizeCheck();
        sizeCheck.setStr("Perfect Java EE sample.");
        sizeCheck.setListSrr(Arrays.asList("1", "2"));
        sizeCheck.setArrStr(new String[] {"1", "2"});
        
        Set<ConstraintViolation<SizeCheck>> vRet = validator.validate(sizeCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)3));
    }
    
    @Test
    public void リスト11_8() {
        MinMaxCheck minMaxCheck = new MinMaxCheck();
        minMaxCheck.setIntVal(8);
        minMaxCheck.setBdVal(BigDecimal.valueOf(200));
        
        Set<ConstraintViolation<MinMaxCheck>> vRet = validator.validate(minMaxCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)2));
    }
    
    @Test
    public void リスト11_9() {
        DecimalMinMaxCheck decimalMinMaxCheck = new DecimalMinMaxCheck();
        decimalMinMaxCheck.setIntVal(4);
        decimalMinMaxCheck.setBdVal(BigDecimal.valueOf(42.195));
        
        Set<ConstraintViolation<DecimalMinMaxCheck>> vRet = validator.validate(decimalMinMaxCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)2));
    }
    
    @Test
    public void リスト11_10() {
        DigitsCheck digitsCheck = new DigitsCheck();
        digitsCheck.setCheckDigits(BigDecimal.valueOf(4646.4646));
        
        Set<ConstraintViolation<DigitsCheck>> vRet = validator.validate(digitsCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)1));
    }
    
    @Test
    public void リスト11_11() {
        DateCheck dateCheck = new DateCheck();
        Calendar futureCal = Calendar.getInstance();
        futureCal.set(Calendar.YEAR, 2050);
        futureCal.add(Calendar.MONTH, 2);
        futureCal.add(Calendar.DATE, 22);
        
        dateCheck.setBirthDate(futureCal.getTime());
        Calendar pastCal = Calendar.getInstance();
        pastCal.set(Calendar.YEAR, 2012);
        pastCal.add(Calendar.MONTH, 2);
        pastCal.add(Calendar.DATE, 22);
        dateCheck.setDeliveryDate(pastCal.getTime());
        
        Set<ConstraintViolation<DateCheck>> vRet = validator.validate(dateCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)2));
    }
    
    @Test
    public void リスト11_12() {
        DateAndTimeCheck dateAndTimeCheck = new DateAndTimeCheck();
        dateAndTimeCheck.setDeliveryDate(ZonedDateTime.of(2012, 2, 22, 0, 0, 0, 0, ZoneId.systemDefault()));
        
        Set<ConstraintViolation<DateAndTimeCheck>> vRet = validator.validate(dateAndTimeCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)1));
    }
    
    @Test
    public void リスト11_13() {
        PatternCheck patternCheck = new PatternCheck();
        patternCheck.setStr("perfect@java.ee");
        
        Set<ConstraintViolation<PatternCheck>> vRet = validator.validate(patternCheck);
        
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)1));
    }
}
