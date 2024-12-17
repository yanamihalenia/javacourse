package lesson5;

public class Student {

    public String studentName;
    public String studentSurname;
    public int studentAge;
    public int countOfLessons;

    public Student(String firstName, String lastName) {
        this.studentName = firstName;
        this.studentSurname = lastName;
    }

    public Student(String firstName, String lastName, int age) {
        this.studentName = firstName;
        this.studentSurname = lastName;
        this.studentAge = age;
    }

    public Student(String firstName, String lastName, int age, int lessons) {
        this.studentName = firstName;
        this.studentSurname = lastName;
        this.studentAge = age;
        this.countOfLessons = lessons;
    }

    public String studentFullName (){
        String fullName = "Student full name: " + studentName + " " + studentSurname;
        return fullName;
    }

    public void studentLessons (){
        System.out.println("Student " + studentSurname + " visits " + countOfLessons + " lessons.");
    }
}
