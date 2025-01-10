package lesson7.services.impl;

import lesson7.domain.Order;
import lesson7.services.DeliverOrder;
import lesson7.services.GetOrder;
import lesson7.services.MakeOrder;
import lesson7.services.SaveOrderToDb;

public class GetOrderOnlineImpl implements GetOrder {

    private SaveOrderToDb saveOrder;
    private MakeOrder cookOrder;
    private DeliverOrder deliver;

    public GetOrderOnlineImpl(SaveOrderToDb saveOrder, MakeOrder cookOrder, DeliverOrder deliverToAnyPlace) {
        this.saveOrder = saveOrder;
        this.cookOrder = cookOrder;
        this.deliver = deliverToAnyPlace;
    }

    @Override
    public void getOrder(Order order) {
        System.out.println("Online order: " + order.getWhatToDeliver());
        saveOrder.saveOrderToDb();
        cookOrder.showInfoAboutOrder();
        if(!order.isDelivery()){
            deliver.delivery();
        }else {
            System.out.println("Order ready");
        }
    }
}
