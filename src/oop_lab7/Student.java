package oop_lab7;
//Talking about Student?
//1.ID
//2.Majot
//3.Faculty
//4.name

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//tostring
    public static String gender = "Male";
    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default contructor
    public Student(){}
    //create constructor by owner
    public  Student (String id,String m,String f,String n) {
//        asigne data to class properties

        this.id = id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods
    public  String  getId(){
        return this.id;
    }
    public void  setId(String id){
        this.id = id;
    }
    public String getFaculty() {
        return this.faculty;
    }
    public  void  setFaculty(String faculty){
        this.faculty = faculty;
    }
    public String getMajor() {
        return this.major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}//class
