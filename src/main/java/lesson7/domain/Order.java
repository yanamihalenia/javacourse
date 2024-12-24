package lesson7.domain;

public class Order {

    private String whatToDeliver;
    private boolean deliveryToHome;

    public Order(String whatToDeliver, boolean deliveryToHome) {
        this.whatToDeliver = whatToDeliver;
        this.deliveryToHome = deliveryToHome;
    }

    public String getWhatToDeliver() {
        return whatToDeliver;
    }

    public boolean isDeliveryToHome() {
        return deliveryToHome;
    }
}
