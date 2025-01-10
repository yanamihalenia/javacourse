package lesson7;


import lesson7.domain.Order;
import lesson7.services.impl.*;

public class FoodDeliveryApp {

    public static void main(String[] args) {

        Order yanaOrder = new Order("Pasta, tea", true);
        Order artemOrder = new Order("Burger, juice", false);
        Order annaOrder = new Order("Soup, salad", false);

        GetOrderOnlineImpl order1 = new GetOrderOnlineImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderToHomeImpl());

        GetOrderPhoneImpl order2 = new GetOrderPhoneImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderFromCafeImpl());

        GetOrderOnlineImpl order3 = new GetOrderOnlineImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderToHomeImpl());

        order1.getOrder(yanaOrder);
        order2.getOrder(artemOrder);
        order3.getOrder(annaOrder);
    }
}
