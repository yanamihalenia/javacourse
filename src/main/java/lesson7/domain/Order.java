package lesson7.domain;

public class Order {

    private String whatToDeliver;
    private boolean delivery;

    public Order(String whatToDeliver, boolean delivery) {
        this.whatToDeliver = whatToDeliver;
        this.delivery = delivery;
    }

    public String getWhatToDeliver() {
        return whatToDeliver;
    }

    public boolean isDelivery() {
        return delivery;
    }
}
