package library.model;

import library.service.Printable;

public class Book extends LibraryResource implements Printable {

    public Book(int resourceId, String title, String author) {
        super(resourceId, title, author);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return 5 * overdueDays;
    }

    @Override
    public void printDetails() {
        System.out.println("Resource Type : Book");
        System.out.println("Resource ID   : " + getResourceId());
        System.out.println("Title         : " + getTitle());
        System.out.println("Author        : " + getAuthor());
    }
}