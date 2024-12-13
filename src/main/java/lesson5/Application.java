package lesson5;

public class Application {

    public static void main(String[] args){

        Student yana        = new Student("Yana", "Mihalenia");
        Student artem       = new Student("Artem", "Ivanov", 33);
        Student yaroslav    = new Student("Yaroslav", "Alexandrov", 12, 4);

        yana.countOfLessons  = 8;
        artem.countOfLessons = 7;


        String yanaFullName = yana.studentFullName();
        System.out.println(yanaFullName);

        String artemFullName = artem.studentFullName();
        System.out.println(artemFullName);

        String yaroslavFullName = yaroslav.studentFullName();
        System.out.println(yaroslavFullName);

        yana.studentLessons();
        artem.studentLessons();
        yaroslav.studentLessons();

        artem.studentLessons(10);
    }
}
