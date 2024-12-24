package lesson7.services.impl;

import lesson7.services.DeliverOrder;

public class DeliveryOrderImpl implements DeliverOrder {
    @Override
    public void deliverToHome() {
        System.out.println("Your order will be delivered soon");
    }

    @Override
    public void takeAwayFromCafe() {
        System.out.println("Your order is ready. Please pick up it in the cafe");
    }

}
