package Chapter11_1;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import static org.hamcrest.CoreMatchers.is;

/**
 * 11-1 Bean Validationとは.
 * 
 * リスト11.3　リスト11.1のEmployeeクラスに対する検証
 * 
 * @author kikuta
 */
public class List11_3Test {
    
    @Test
    public void リスト11_3() {
        //Validatorインスタンス取得
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        
        //リスト11.1の社員インスタンスを生成
        Employee employee = new Employee();
        
        //社員番号に0をセット
        employee.setNumber(0);
        
        //社員名にnullをセット
        employee.setName(null);
        
        //Bean Validationによる検証の実行と結果取得
        Set<ConstraintViolation<Employee>> vRet = validator.validate(employee);
        
        //検証結果の表示
        vRet.stream().forEach(e -> {
            System.out.println(e.getMessage());
        });
        
        assertThat(vRet.stream().count(), is((long)2));
        assertTrue(vRet.stream()
                .map(e -> e.getMessage())
                .collect(Collectors.toList())
                .containsAll(
                        Arrays.asList(
                                "must be greater than or equal to 1",
                                "may not be null")
                )
        );
    }
}
