package ra.springvalidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.springvalidate.model.Account;
import ra.springvalidate.service.AccountService;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/register")
    public String regiter(Model model){
        model.addAttribute("account",new Account());
        return "register";
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String doRegister(@ModelAttribute @Valid Account account, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "register";
        }
        accountService.register(account);
        return "redirect:/";
    }
}
