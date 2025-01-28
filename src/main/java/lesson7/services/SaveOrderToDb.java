package lesson7.services;

public interface SaveOrderToDb {

    default void saveOrderToDb(){
        System.out.println("Order was successfully saved to the DB");
    }
}
