package Chapter11_3_1.CustomConstraint.List30_34;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * リスト11.32　リスト11.27の@CheckEmployeeRank定義にvalueを追加.
 * 
 * @author kikuta
 */
@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = { EmployeeRoleRankValidation.class })
@Documented
public @interface CheckEmployeeRank {
    String message() default "ランクが高い人は必ず役割を持つ必要があります。";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
    
    //CheckModeを指定できるようにする
    CheckMode value();
}
