package lesson7.services;

public interface DeliverOrder {

    default void delivery() {
        System.out.println("Your order is ready. Please pick it up in the cafe");
    }
}
