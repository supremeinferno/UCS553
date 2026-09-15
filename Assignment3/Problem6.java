
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        String password = "password";
        String username = "user";

        try {
            login(password, username);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } catch (AccountLockedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program ends ......");
        }
    }

    static void login(String p, String u)
            throws InvalidUsernameException,
            InvalidPasswordException,
            AccountLockedException {

        int maxTrials = 10;
        Scanner sc = new Scanner(System.in);

        while (maxTrials-- != 0) {
            System.out.println("Enter Username followed by password");
            String user = sc.nextLine();
            String password = sc.nextLine();

            if (user.length() != u.length()) {
                throw new InvalidUsernameException("Invalid Username length");
            }
            if (p.length() != password.length()) {
                throw new InvalidPasswordException("Invalid Password Length");
            }
            if (password.equals(p)) {
                System.out.println("Login Sucessful .....");
                return;
            } else {
                System.out.println("try again.....");
            }
        }

        throw new AccountLockedException("Account has been suspended ...");
    }
}

class InvalidUsernameException extends Exception {
    InvalidUsernameException(String s) {
        super(s);
    }
}

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String s) {
        super(s);
    }
}

class AccountLockedException extends Exception {
    AccountLockedException(String s) {
        super(s);
    }
}
