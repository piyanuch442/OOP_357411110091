package oop_lab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("1809900701254","Tan",
                new Address("200/1","NST","80000"),new Job("Police",15000));
        System.out.println(person.toString());

        person.getJob().setSalary(20000);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());
    }
}//class
