package ra.springvalidate.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = PhoneUniqueValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PhoneUnique {
    String message() default "Phone is exist";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
