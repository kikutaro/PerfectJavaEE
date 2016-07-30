package Chapter11_3_1.CustomConstraint.List30_34;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * リスト11.30　EmployeeRoleRankValidationクラスの実装.
 * 
 * @author kikuta
 */
public class EmployeeRoleRankValidation implements ConstraintValidator<CheckEmployeeRank, Employee> {

    private CheckMode mode;
    
    @Override
    public void initialize(CheckEmployeeRank c) {
        //@CheckEmployeeRankのvalueで指定された列挙型の値を取得
        this.mode = c.value();
    }

    @Override
    public boolean isValid(Employee e, ConstraintValidatorContext cvc) {
        //指定されたチェックモードで検証のロジックを分岐
        switch(this.mode) {
            case HARD :
                return !((e.getRank() == 3) && (e.getRole().equals(Role.NONE)));
            case SOFT :
                return true;
            default :
                return !((e.getRank() == 5) && (e.getRole().equals(Role.NONE)));
        }
    }    
}
