package lesson7.services;

public interface MakeOrder {

    default void showInfoAboutOrder(){
        System.out.println("Your order is in progress");
    }
}
