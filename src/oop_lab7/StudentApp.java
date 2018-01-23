package oop_lab7;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
//        create object as Student
        Student student1 = new Student();

        student1.setId("1111111111111");
        student1.setFaculty("Information System");
        student1.setMajor("Management Technology");
        student1.setName("Boy Saiyai");
        System.out.println(student1.toString());

        Student student2 = new Student("222222222222","Management","Business Management","Girl Songkhal");
        System.out.println(student2.toString());
        student2.setName("Girl Trang");
        System.out.println(student2.toString());

        Student student3 = new Student();
//        student3 = inputData(student3);
//        System.out.println(student3.toString());
        System.out.println(student1.gender);
        System.out.println(Student.gender);
    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your student data: ");
        System.out.print("Name: ");
        s.setName(scanner.nextLine());
        System.out.print("ID: ");
        s.setId(scanner.nextLine());
        System.out.print("Major: ");
        s.setMajor(scanner.nextLine());
        System.out.print("Faculty: ");
        s.setFaculty(scanner.nextLine());

        return s;
    }

}//class
