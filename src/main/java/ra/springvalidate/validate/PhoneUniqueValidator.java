package ra.springvalidate.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.springvalidate.service.AccountService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class PhoneUniqueValidator implements ConstraintValidator<PhoneUnique,String> {
    @Autowired
    private AccountService accountService;
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return !accountService.isPhoneExits(value);
    }
}
