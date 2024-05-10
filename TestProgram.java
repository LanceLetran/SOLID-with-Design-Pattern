public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("12345");
        LibraryResource book = new Book("Effective Java");
        LibraryResource journal = new Journal("Communications of the ACM");

        student.borrowResource(book);
        student.borrowResource(journal);

        student.returnResource(book);
        student.returnResource(journal);
    }
}
