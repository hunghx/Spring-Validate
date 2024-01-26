package ra.springvalidate.validate;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch,Object> {
    private  String password;
    private String confirmPassword;
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Object passwordvalue = new BeanWrapperImpl(value).getPropertyValue(password);
        Object confirmPasswordvalue = new BeanWrapperImpl(value).getPropertyValue(confirmPassword);
        if (!passwordvalue.equals(confirmPasswordvalue)){
            // xet loi nayf nam o field nao
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addPropertyNode(confirmPassword)
                    .addConstraintViolation();
            return false;
        }
        return true;
    }

    @Override
    public void initialize(PasswordMatch passwordMatch) {
        this.password = passwordMatch.password(); // ten field
        this.confirmPassword = passwordMatch.confirmPassword(); // teen field
    }
}
