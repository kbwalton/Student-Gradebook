import java.util.Scanner;

// Main program for user interaction
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gradebook gradebook = new Gradebook();

        while (true) {
            System.out.println("\nGradebook Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Update Grade");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    gradebook.addStudent(name);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    gradebook.addGradeToStudent(name, grade);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter grade index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    grade = scanner.nextDouble();
                    gradebook.updateGradeForStudent(name, index, grade);
                    break;
                case 4:
                    gradebook.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
