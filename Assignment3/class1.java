import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class custom extends Exception {
    custom(String message) {
        super(message);
    }
}

public class class1 {

    static void printer(double amount) throws custom {
        if (amount < 0) {
            throw new custom("Please Enter Valid Info");
        }
    }

    public static void main(String[] args) {

        try {
            int[] arr = { 1, 2, 3, 4, 5 };

            // Changed 5 to 4 so no exception occurs here
            int a = arr[4];

            FileReader f = new FileReader("1.txt");

            Scanner sc = new Scanner(System.in);

            System.out.print("Please Enter Your Bank Balance: ");
            double amount = sc.nextDouble();

            printer(amount);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound Error");

        } catch (IOException e) {
            System.out.println(e.getMessage());

        } catch (custom e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("End of program");
        }
    }
}