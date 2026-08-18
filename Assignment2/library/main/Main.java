package library.main;

import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.util.InputValidator;

public class Main {

    public static void main(String[] args) {

        LibraryResource[] resources = new LibraryResource[5];

        resources[0] = new Book(101, "Java Programming", "James Gosling");
        resources[1] = new DigitalResource(102, "Machine Learning", "Andrew Ng");
        resources[2] = new Book(103, "Data Structures", "Mark Allen");
        resources[3] = new DigitalResource(104, "Artificial Intelligence", "Stuart Russell");
        resources[4] = new Book(105, "Operating Systems", "Abraham Silberschatz");

        int[] overdueDays = { 5, 3, 0, 7, 2 };

        double totalFine = 0;

        for (int i = 0; i < resources.length; i++) {

            LibraryResource resource = resources[i];

            if (!InputValidator.validateResourceId(resource.getResourceId())) {
                System.out.println("Invalid Resource ID");
                continue;
            }

            if (!InputValidator.validateFineDays(overdueDays[i])) {
                System.out.println("Invalid overdue days");
                continue;
            }

            System.out.println("\n----------------------------");

            ((library.service.Printable) resource).printDetails();

            double fine = resource.calculateFine(overdueDays[i]);

            System.out.println("Overdue Days  : " + overdueDays[i]);
            System.out.println("Fine          : Rs. " + fine);

            totalFine += fine;
        }

        System.out.println("\n============================");
        System.out.println("Total Fine: Rs. " + totalFine);
        System.out.println("============================");

        LibraryResource.displayTotalResources();
    }
}