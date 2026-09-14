import java.util.Scanner;

class InsufficientBalance extends Exception {
    InsufficientBalance(String message) {
        super(message);
    }
}

public class class2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your Bank Balance : ");
        double balance = sc.nextDouble();
        System.out.print("Please Enter Your Widrawal Amount : ");
        double amount = sc.nextDouble();
        try {
            widraw(balance, amount);
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    static void widraw(double bal, double amt) throws InsufficientBalance {
        if (bal < amt) {
            throw new InsufficientBalance("Payment Failed Due To Insufficent Funds");
        } else {
            System.out.println("Payment Sucessful");
        }
    }
}
