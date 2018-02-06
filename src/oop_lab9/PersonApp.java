package oop_lab9;

public class PersonApp {
    public static void main(String[] args) {
        Address address = new Address("200/1","Nakhonsithammarat","80000");

        Job job = new Job("Police",15000);

        Person person = new Person("1809900701254","Tan",address, job);
        System.out.println(person.toString());
    }
}//class
