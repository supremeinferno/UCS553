package library.model;

import library.service.Printable;

public class DigitalResource extends LibraryResource implements Printable {

    public DigitalResource(int resourceId, String title, String author) {
        super(resourceId, title, author);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return 2 * overdueDays;
    }

    @Override
    public void printDetails() {
        System.out.println("Resource Type : Digital Resource");
        System.out.println("Resource ID   : " + getResourceId());
        System.out.println("Title         : " + getTitle());
        System.out.println("Author        : " + getAuthor());
    }
}