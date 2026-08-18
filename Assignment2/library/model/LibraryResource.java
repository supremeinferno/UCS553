package library.model;

public abstract class LibraryResource {

    private int resourceId;
    private String title;
    private String author;

    private static String libraryName = "Nava Nalanda";
    private static int resourceCounter = 0;

    public LibraryResource(int resourceId, String title, String author) {
        this.resourceId = resourceId;
        this.title = title;
        this.author = author;

        resourceCounter++;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void displayTotalResources() {
        System.out.println("Total resources created: " + resourceCounter);
    }

    public abstract double calculateFine(int overdueDays);
}