package lesson4;

public class taskArraySecond {
    public static void main(String[] args){

        /*Есть числовой массив. Необходимо вывести инфо о его элементах:
            a) количество элементов;
            b) сумма элементов;
            с) максимальный элемент;
            d) минимальный элемент.
         */

        int[] array = {4,7,3,76,33,25,1,94};

        int numberOfElements = array.length;
        int sumOfElements = 0;
        int minElement = array[0];
        int maxElement = array[0];

        for (int i = 0; i < array.length; i++){

            sumOfElements += array[i];

            if (array[i] < minElement){
                minElement = array[i];
            }

            if (array[i] > maxElement){
                maxElement = array[i];
            }
        }
        System.out.println("Count array elements: " + numberOfElements);
        System.out.println("Sum array elements: " + sumOfElements);
        System.out.println("Min element: " + minElement);
        System.out.println("Max element: " + maxElement);

    }
}
