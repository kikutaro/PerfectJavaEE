package Chapter11_3_7.CrossParameterConstraints;

import java.util.Date;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;

/**
 * リスト11.52　DateParametersValidatorクラスの実装.
 * 
 * @author kikuta
 */
@SupportedValidationTarget(ValidationTarget.PARAMETERS)
public class DateParametersValidator implements ConstraintValidator<DateParameters, Object[]> {

    @Override
    public void initialize(DateParameters a) {
        
    }

    @Override
    public boolean isValid(Object[] params, ConstraintValidatorContext cvc) {
        if(params.length != 2) {
            throw new IllegalStateException( "検証が想定する引数の数に一致しません。" );
        }
        if (params[0] == null || params[1] == null) return true;
        return ((Date)params[0] ).before((Date)params[1]);
    }
    
}
