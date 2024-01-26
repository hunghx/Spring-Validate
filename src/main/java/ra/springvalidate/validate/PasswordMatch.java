package ra.springvalidate.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = PasswordMatchValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordMatch {
    String password();
    String confirmPassword();
    String message() default "Password not math";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
