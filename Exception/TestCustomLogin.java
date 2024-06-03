package in.co.Exception;

import javax.security.auth.login.LoginException;

public class TestCustomLogin {
    public static void main(String[] args) throws LoginException {
        String loginId = null;
        if(loginId == null || loginId !="chetan"){
            throw new LoginException();
        }else{
            System.out.println("Login Sucessfully");
        }
    }
}
