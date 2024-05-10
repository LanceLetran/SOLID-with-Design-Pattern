public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("12345");
        LibraryResource book = new Book("Effective Java");
        LibraryResource journal = new Journal("Communications of the ACM");
        LibraryManager libraryManager = new LibraryManager();

        libraryManager.borrowResource(student, book);
        libraryManager.borrowResource(student, journal);

        libraryManager.returnResource(student, book);
        libraryManager.returnResource(student, journal);
    }
}
