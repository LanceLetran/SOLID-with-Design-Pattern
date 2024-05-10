public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkoutResource() {
        System.out.println("Journal checked out: " + title);
    }

    @Override
    public void returnResource() {
        System.out.println("Journal returned: " + title);
    }
}
