public class Student {
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.println("Attempting to borrow: " + resource.getTitle());
        resource.checkoutResource();
    }

    public void returnResource(LibraryResource resource) {
        System.out.println("Returning: " + resource.getTitle());
        resource.returnResource();
    }
}
