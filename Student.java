public class Student {
    private Course course;
    private String name;

    public Student(Course course) {
        this.course = course;
        this.name = "John";
    }
    public void showDetails() {
        System.out.println("Student: " + name + ", Course: " + course.getCourseName());
    }
}
