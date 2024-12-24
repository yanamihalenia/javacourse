package lesson7.services;

public interface MakeOrder {

    default void orderInProgress(){
        System.out.println("Your order is in progress");
    }
}
