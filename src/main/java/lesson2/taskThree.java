package lesson2;

import java.util.Scanner;

public class taskThree {

    /*Пользователь по очереди вводит свои оценки по предметам.
     * Предметов всего 10. После каждого ввода нужно выводить -
     * а) сколько оценок было введено
     * b) среднее арифметическое всех оценок
     * c) сколько оценок осталось ввести */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        do {
            System.out.println("Enter a mark: ");
            int mark = sc.nextInt();
            sum += mark;
            int average = sum / i;
            System.out.println("Already entered marks: " + i);
            int remaind = 10 - i;
            i++;
            System.out.println("Average: " + average);
            System.out.println("Remain: " + remaind);
        } while (i <= 10);
    }
}
