public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkoutResource() {
        System.out.println("Book checked out: " + title);
    }

    @Override
    public void returnResource() {
        System.out.println("Book returned: " + title);
    }
}
