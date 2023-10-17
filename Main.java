import java.util.Scanner;

/*
Author: Riley Kneen-Teed
Date: 17/10/2023
Description:


 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course[] courses = new Course[2];
        for (int i = 0; i < 2; i++) {
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


            }


        }

    }
    }
