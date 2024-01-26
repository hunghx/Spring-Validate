package ra.springvalidate.model;

import jdk.internal.javac.NoPreview;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.springvalidate.validate.PasswordMatch;
import ra.springvalidate.validate.PhoneUnique;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Data
@PasswordMatch(password = "password",confirmPassword = "confirmPassword")
public class Account {
    public int id;
    @NotBlank
    @Size(min = 6 , message = "Toi thieu 6 ki tu")
    private String username;
    @NotBlank
    @Size(min = 8 , message = "Toi thieu 8 ki tu")
    private String password;
    @Pattern(regexp = "^\\d{10,11}$", message = "so dien thoai khong dung dinh dang")
    @PhoneUnique
    private String phone;

    private String confirmPassword;
    @NotBlank
    @Pattern(regexp = "^[A-Z].+$" , message = "viet hoa chu cai dau")
    private String fullName;
}
