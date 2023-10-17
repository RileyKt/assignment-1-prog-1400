
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course[] courses = new Course[2];
        for(int i =0; i < 2; i++){
            System.out.print("Enter Course Name: ");
            String courseName = scanner.next();
            courses[i] = new Course(courseName);
            for (int j = 0; j < 6; j++) {
                System.out.print("Enter Student Name: ");
                String studentName = scanner.next();
                System.out.print("Enter Assignment1 Mark: ");
                double assignment1 = scanner.nextDouble();
                System.out.print("Enter Assignment2 Mark: ");
                double assignment2 = scanner.nextDouble();

                if (assignment1 < 0 || assignment1 > 100 || assignment2 < 0 || assignment2 > 100) {
                    System.out.println("Invalid mark. Mark should be between 0.0 and 100.0.");
                    j--;
                    continue;
                }


            }



        }


    }


    class Course{
        private String courseName;
        private Student[] students;
        private double averageAssignment1;
        private double getAverageAssignment2;

        public Course(String courseName) {
            this.courseName = courseName;
            this.students = new Student[6];
        }
    }

    class Student{
        private String name;
        private double assignment1;
        private double assignment2;

        public double getAssignment1() {
            return assignment1;
        }

        public double getAssignment2() {
            return assignment2;
        }
    }


