import java.util.Scanner;

/*
Author: Riley Kneen-Teed
Date: 17/10/2023
Description:


 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double assignment1, assignment2;
        Course[] courses = new Course[2];
        Student[] javaStudents = new Student[6];
        Student[] pythonStudents = new Student[6];
        double assignment1Average;
        double assignment2Average;
        double totalAssignment1 =0, totalAssignment2 =0;




        System.out.println("Programming IT Courses");
        System.out.println("Course Entry");
        printTheLine();
        for(int i =0; i<courses.length; i++){
            System.out.println(String.format("Enter name for course # %d:",i+1));
            courses[i]= new Course(scanner.nextLine());
        }

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter students for " + courses[i].courseName + ": ");
            for (int j = 0; j < courses[i].students.length; j++) {
                System.out.println(String.format("Enter name for student # %d:", j + 1));
                name = scanner.nextLine();
                System.out.println(String.format("Enter Assignment1 mark for %s:", name));
                assignment1 = scanner.nextDouble();
                System.out.println(String.format("Enter Assignment2 mark for %s:", name));
                assignment2 = scanner.nextDouble();
                scanner.nextLine();
                courses[i].addStudent(new Student(name, assignment1, assignment2), j);
                //calculating total mark for assignment 1 for all students
                totalAssignment1 += assignment1;
                totalAssignment2 += assignment2;
            }
            assignment1Average = totalAssignment1/6;
            assignment2Average = totalAssignment2/6;
            courses[0].averageAssignment1 = assignment1Average;
            courses[0].averageAssignment2 = assignment2Average;
            courses[0].coursesAverage = (assignment1Average+assignment2Average)/2;


        }
        //generate course reports for both courses
        for (Course course : courses) {
            System.out.println("Report: Stats per Course");
            printTheLine();
            System.out.println(course.coursesReport());
        }







        //calculate course average
        System.out.println("Report: Stats per Course");
        printTheLine();
        System.out.println(courses[0].coursesReport());


        System.out.println("Report: Stats per student");
        printTheLine();
        System.out.println(courses[0].courseName);
        for(int i =0; i< javaStudents.length; i++){
            System.out.println(javaStudents[i].stdReport());
        }




    }
    public static void printTheLine(){
        System.out.println("=".repeat(40));
    }
}
