package lesson4;

public class taskArrayOne {

    public static void main(String[] args){

        /*Есть два числовых массива разной длинны (без дубликатов в рамках одного массива).
        Нужно вывести в терминал все элементы, которые встречаются в обоих массивах.
         */

        int[] arrayFirst  = {5, 7, 25, 3, 20, 47, 22};
        int[] arraySecond = {3, 12, 47, 29, 55, 6, 1, 0, 34, 7};

        for (int i = 0; i < arrayFirst.length; i++){

            for (int j = 0; j < arraySecond.length; j++){

                if (arrayFirst[i] == arraySecond[j]){

                    System.out.println("Repeating number:" + arrayFirst[i]);
                    break;
                }
            }
        }
    }
}
