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
        Student[] students = new Student[6];

        System.out.print("Enter students for Java Programming: ");

        for (int i = 0; i < students.length; i++) {
            System.out.println(String.format("Enter name for student # %d:",i+1));
             name = scanner.nextLine();
            System.out.println(String.format("Enter Assignment1 mark for # %S:",name));
            assignment1 = scanner.nextDouble();
            System.out.println(String.format("Enter Assignment2 mark for # %S:",name));
            assignment2 = scanner.nextDouble();


        }




    }
    }
