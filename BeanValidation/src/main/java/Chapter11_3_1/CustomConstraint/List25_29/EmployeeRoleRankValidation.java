package Chapter11_3_1.CustomConstraint.List25_29;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * リスト11.28　EmployeeRoleRankValidationクラスの実装.
 * 
 * @author kikuta
 */
public class EmployeeRoleRankValidation implements ConstraintValidator<CheckEmployeeRank, Employee> {

    @Override
    public void initialize(CheckEmployeeRank a) {
    }

    @Override
    public boolean isValid(Employee e, ConstraintValidatorContext cvc) {
        //ランク5の社員はロールを持つことを検証
        return !((e.getRank() == 5) && (e.getRole().equals(Role.NONE)));
    }
    
}
