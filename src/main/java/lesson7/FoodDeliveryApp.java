package lesson7;


import lesson7.domain.Order;
import lesson7.services.impl.DeliveryOrderImpl;
import lesson7.services.impl.GetOrderImpl;
import lesson7.services.impl.MakeOrderImpl;
import lesson7.services.impl.SaveOrderToDbImpl;

public class FoodDeliveryApp {

    public static void main(String[] args) {

       Order YanaOrder = new Order("Pasta, tea", true);
        Order ArtemOrder = new Order("Burger, juice", false);

        GetOrderImpl order1 = new GetOrderImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderImpl());

        order1.getOrderOnline(YanaOrder);
        order1.getOrderByPhone(ArtemOrder);
    }
}
