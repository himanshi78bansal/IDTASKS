import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("\nEnter number of Students: ");
        int numStu = sc.nextInt();
        sc.nextLine();

        // Input student names and grades

        for (int i = 0; i < numStu; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Student's name: ");
            String name = sc.nextLine();

            System.out.print("Enter total number of Assignments: ");
            int numAssign = sc.nextInt();
            sc.nextLine();

        List<Float> grades = new ArrayList<>();

        for (int j = 0; j < numAssign; j++) {
            System.out.print("Enter grades for Assignment " + (j + 1) + " : ");
            float grade = sc.nextFloat();
            sc.nextLine();
            grades.add(grade);
        }

            students.add(new Student(name, grades));
        }

        // Display grades and average for each student
        System.out.println("\n--- Gradebook Summary ---");

        for (Student student : students) {
            System.out.println("\nStudent's Name : " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Average: " + student.calculateAverage());
        }
        
        System.out.println();
        sc.close();
    }
}

class Student {
    private String name;
    private List<Float> grades;

    public Student(String name, List<Float> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Float> getGrades() {
        return grades;
    }

    public float calculateAverage() {
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}
