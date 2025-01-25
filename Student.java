import java.util.ArrayList;

// Class representing a Student
class Student {
    private String name;
    private ArrayList<Double> grades;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Get the student's name
    public String getName() {
        return name;
    }

    // Add a grade to the student's grade list
    public void addGrade(double grade) {
        grades.add(grade);
    }

    // Update a grade at a specific index
    public void updateGrade(int index, double grade) {
        if (index >= 0 && index < grades.size()) {
            grades.set(index, grade);
        } else {
            System.out.println("Invalid grade index.");
        }
    }

    // Calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    // Display the student's grades
    public void displayGrades() {
        System.out.println("Grades for " + name + ": " + grades);
    }
}
