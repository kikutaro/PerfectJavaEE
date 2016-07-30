package Chapter11_3_1.CustomConstraint.List25_29;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * リスト11.27　@CheckEmployeeRankの定義.
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
}
