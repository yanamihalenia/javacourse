package lessons.lesson2;

import java.util.Scanner;

public class taskOne {

    public static void main(String[] args) {

        //Пользователь вводит число в консоли. Необходимо вывести факториал этого числа:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int result = 1;

        for (int i=1; i <= number; i++){
            result = result * i;
        }
        System.out.println("Factorial " + number + " is " + result);
    }
}
