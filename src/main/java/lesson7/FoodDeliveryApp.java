package lesson7;


import lesson7.domain.Order;
import lesson7.services.impl.*;

public class FoodDeliveryApp {

    public static void main(String[] args) {

        Order yanaOrder = new Order("Pasta, tea", false);
        Order artemOrder = new Order("Burger, juice", false);
        Order annaOrder = new Order("Soup, salad", true);

        GetOrderImpl order1 = new GetOrderImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderFromCafeImpl());

        GetOrderImpl order2 = new GetOrderImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderToHomeImpl());

        GetOrderImpl order3 = new GetOrderImpl(
                new SaveOrderToDbImpl(),
                new MakeOrderImpl(),
                new DeliveryOrderToHomeImpl());

        order1.getOrderOnline(yanaOrder);
        order2.getOrderByPhone(artemOrder);
        order3.getOrderByPhone(annaOrder);
    }
}
