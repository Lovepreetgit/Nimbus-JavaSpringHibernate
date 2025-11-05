public class MainCRUD {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        // Create
        Student s = new Student("Alice");
        dao.createStudent(s);
        // Read
        Student read = dao.readStudent(s.getId());
        System.out.println("Read Student: " + read.getName());
        // Update
        read.setName("Bob");
        dao.updateStudent(read);
        // Delete
        dao.deleteStudent(read.getId());
    }
}
