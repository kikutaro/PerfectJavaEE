package Chapter11_3_3.ConstraintComposition;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * リスト11.39　複数のアノテーションをまとめたアノテーションを定義.
 * 
 * @author kikuta
 */
@NotNull
@Size(min = 8, max = 16)
@Pattern(regexp = ".*[!-/]+.*")
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface CheckPassword {
    String message() default "パスワードの条件を満たしていません。";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
