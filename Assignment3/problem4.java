import java.util.Scanner;

public class problem4 {

    public static void main(String args[]) {
        try {
            function();
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }

    static void function() throws myException {

        int marksA, marksB, marksC;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for subject A : ");
        marksA = sc.nextInt();
        if (marksA > 100 || marksA < 0)
            throw new myException("Invalid Marks");

        System.out.print("Enter marks for subject B : ");
        marksB = sc.nextInt();
        if (marksB > 100 || marksB < 0)
            throw new myException("Invalid Marks");

        System.out.print("Enter marks for subject C : ");
        marksC = sc.nextInt();
        if (marksC > 100 || marksC < 0)
            throw new myException("Invalid Marks");

        System.out.println("Total Marks : " + (marksA + marksB + marksC));

        if (marksA > 90)
            System.out.println("Graded in A : A");
        else if (marksA >= 70)
            System.out.println("Graded in A : B");
        else
            System.out.println("Graded in A : C");

        if (marksB > 90)
            System.out.println("Graded in B : A");
        else if (marksB >= 70)
            System.out.println("Graded in B : B");
        else
            System.out.println("Graded in B : C");

        if (marksC > 90)
            System.out.println("Graded in C : A");
        else if (marksC >= 70)
            System.out.println("Graded in C : B");
        else
            System.out.println("Graded in C : C");
    }
}

class myException extends Exception {

    public myException(String s) {
        super(s);
    }
}
