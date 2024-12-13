package lessons.lesson2;

public class tasktwo {

    //Посчитать сколько нулей будет при произведении все чисел от 1 до:

    public static void main(String[] args) {
        int result = 0;

        for (int i=1; i <= 100; i++){
            int num =i;
            while (num % 5 == 0){
                result++;
                num /= 5;
            }
        }
        System.out.println("Count of zero: " + result);
    }
}
