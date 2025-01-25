import java.util.ArrayList;

// Class representing the Gradebook
class Gradebook {
    private ArrayList<Student> students;

    // Constructor
    public Gradebook() {
        this.students = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(String name) {
        students.add(new Student(name));
    }

    // Find a student by name
    private Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Add a grade to a student
    public void addGradeToStudent(String name, double grade) {
        Student student = findStudent(name);
        if (student != null) {
            student.addGrade(grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Update a grade for a student
    public void updateGradeForStudent(String name, int index, double grade) {
        Student student = findStudent(name);
        if (student != null) {
            student.updateGrade(index, grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all students and their grades
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayGrades();
        }
    }
}
