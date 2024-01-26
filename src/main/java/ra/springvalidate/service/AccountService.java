package ra.springvalidate.service;

import org.springframework.stereotype.Service;
import ra.springvalidate.model.Account;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private static final List<Account> accounts = new ArrayList<>();
    static {
        accounts.add(new Account(1,"hunghx","12345678","0987654321","12345678","Hungf Hoof"));
    }
    public void register(Account account){
        accounts.add(account);
    }
    public boolean isPhoneExits(String phone){
        for (Account account:accounts){
            if (account.getPhone().equals(phone))
                return true;
        }
        return false;
    }
}
