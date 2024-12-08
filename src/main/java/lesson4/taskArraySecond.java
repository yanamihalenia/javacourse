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

        int a = array.length;
        int b = 0;
        int c = array[0];
        int d = array[0];

        for (int i = 0; i < array.length; i++){

            b += array[i];

            if (array[i] < c){
                c = array[i];
            }

            if (array[i] > d){
                d = array[i];
            }
        }
        System.out.println("Count array elements: " + a);
        System.out.println("Sum array elements: " + b);
        System.out.println("Min element: " + c);
        System.out.println("Max element: " + d);

    }
}
