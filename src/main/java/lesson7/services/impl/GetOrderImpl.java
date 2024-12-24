package lesson7.services.impl;

import lesson7.domain.Order;
import lesson7.services.DeliverOrder;
import lesson7.services.GetOrder;
import lesson7.services.MakeOrder;
import lesson7.services.SaveOrderToDb;

public class GetOrderImpl implements GetOrder {

    private SaveOrderToDb saveOrder;
    private MakeOrder cookOrder;
    private DeliverOrder deliverTo;

    public GetOrderImpl(SaveOrderToDb saveOrder, MakeOrder cookOrder, DeliverOrder deliverTo) {
        this.saveOrder = saveOrder;
        this.cookOrder = cookOrder;
        this.deliverTo = deliverTo;
    }

    @Override
    public void getOrderOnline(Order order) {
        System.out.println("Online order: " + order.getWhatToDeliver());
        saveOrder.saveOrderToDb();
        cookOrder.showInfoAboutOrder();
        if(!order.isDeliveryToHome()){
            deliverTo.takeAwayFromCafe();
        }else {
            deliverTo.deliverToHome();
        }
    }

    @Override
    public void getOrderByPhone(Order order) {
        System.out.println("Phone order: " + order.getWhatToDeliver());
        saveOrder.saveOrderToDb();
        cookOrder.showInfoAboutOrder();
        if(!order.isDeliveryToHome()){
            deliverTo.takeAwayFromCafe();
        }else {
            deliverTo.deliverToHome();
        }
    }
}
