import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int[] studentMarks = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            studentMarks[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        for (int marks : studentMarks) {
            char grade = calculateGrade(marks);
            System.out.println("Student with marks " + marks + " gets grade: " + grade);
        }
    }

    public static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}