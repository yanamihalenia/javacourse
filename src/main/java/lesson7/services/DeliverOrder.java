package lesson7.services;

public interface DeliverOrder {

    void deliverToHome();

    default void takeAwayFromCafe(){
        System.out.println("Your order is ready. Please pick up it in the cafe");
    };
}
