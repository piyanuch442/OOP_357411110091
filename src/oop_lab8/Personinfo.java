package oop_lab8;

public class Personinfo {
    public static void main(String[] args) {
        Student student = new Student("1809900702812","piyanuch na nakorn","female",
                22,"357411110091","Management Technology");
        System.out.println(student.toString());
        System.out.println(student.getName());

        Employee employee = new Employee("1809900702811","tan","female",33,"111221",
                "ssss",30000);
        System.out.println(employee.toString());

    }//main

}//class
