public class LibraryManager {
    public void borrowResource(Student student, LibraryResource resource) {
        System.out.println("Student " + student.getStudentId() + " is attempting to borrow: " + resource.getTitle());
        resource.checkoutResource();
    }

    public void returnResource(Student student, LibraryResource resource) {
        System.out.println("Student " + student.getStudentId() + " is returning: " + resource.getTitle());
        resource.returnResource();
    }
}
