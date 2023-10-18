import java.util.Scanner;

/*
Author: Riley Kneen-Teed
Date: 17/10/2023
Description: Program takes input for 2 courses, and input for 6 students with 2 assignment grades each, then outputs data


 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double assignment1, assignment2;
        Course[] courses = new Course[2];

        System.out.println("Programming IT Courses");
        System.out.println("Course Entry");
        printTheLine();
        for (int i = 0; i < courses.length; i++) {
            System.out.println(String.format("Enter name for course # %d:", i + 1));
            courses[i] = new Course(scanner.nextLine());
        }

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter students for " + courses[i].courseName + ": ");
            for (int j = 0; j < courses[i].students.length; j++) {

                System.out.println(String.format("Enter name for student # %d:", j + 1));
                name = scanner.nextLine();
                assignment1 = getValidMark("Enter Assignment1 mark for " + name + ": ");
                assignment2 = getValidMark("Enter Assignment2 mark for " + name + ": ");

                //creates a student and adds them to the course
                courses[i].addStudent(new Student(name, assignment1, assignment2), j);
            }
        }

        //prints out the results for each course
        for (Course course : courses) {
            System.out.println("Report: Stats per Course");
            printTheLine();
            System.out.println(course.coursesReport());
        }

        System.out.println("Report: Stats per student");
        printTheLine();

        //prints out the results for each student for each course
        for (Course course : courses) {
            System.out.println(course.courseName);
            for (Student student : course.students) {
                System.out.println(student.stdReport());
            }
        }
    }


    public static void printTheLine(){
        System.out.println("=".repeat(40));
    }

    //method to check if the mark entered is in the valid range
    public static double getValidMark(String prompt) {
        Scanner scanner = new Scanner(System.in);
        double mark;

        //do while loop to check if next input is in valid range, so it keeps looping until it gets a valid number
        do {
            System.out.print(prompt);
            mark = scanner.nextDouble();
            if (mark < 0.0 || mark > 100.0) {
                System.out.println("Invalid Entry, Mark should be between 0.0 and 100.0.");
            }
        }
        while (mark < 0.0 || mark > 100.0);
        scanner.nextLine();
        return mark;
    }
}
