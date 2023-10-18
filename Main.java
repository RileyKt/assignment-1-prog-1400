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
        Student[] javaStudents = new Student[6];
        Student[] pythonStudents = new Student[6];

        System.out.print("Enter students for Java Programming: ");

        for (int i = 0; i < javaStudents.length; i++) {
            System.out.println(String.format("Enter name for student # %d:",i+1));
             name = scanner.nextLine();
            System.out.println(String.format("Enter Assignment1 mark for # %S:",name));
            assignment1 = scanner.nextDouble();
            System.out.println(String.format("Enter Assignment2 mark for # %S:",name));
            assignment2 = scanner.nextDouble();
            javaStudents[i] = new Student(name,assignment1,assignment2);


        }

        System.out.println("Report: Stats per student");
        printTheLine();
        System.out.println("Java Programming");
        for(int i =0; i< javaStudents.length; i++){
            System.out.println(javaStudents[i].stdReport());
        }
//REPORT: Stats per Course
//================================



    }
    public static void printTheLine(){
        System.out.println("=".repeat(40));
    }
}
