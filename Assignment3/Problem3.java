import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try {
            calculator();
        } catch (myException1 e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    static void calculator() throws myException1, NumberFormatException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a, b;

        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);

        System.out.println("Enter the operator : ");
        char ch = sc.nextLine().charAt(0);
        if (ch != '+' && ch != '-' && ch != '/' && ch != '*') {
            throw new myException1("Invalid opeation was passed");
        }
        int res;
        switch (ch) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);
                break;
            case '*':
                res = a * b;
                System.out.println(res);
                break;
            case '/':
                res = a / b;
                System.out.println(res);
                break;

        }
    }
}

class myException1 extends Exception {
    myException1(String s) {
        super(s);
    }
}
