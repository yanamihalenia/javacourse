package lesson7.services;

import lesson7.domain.Order;

public interface GetOrder {

    void getOrderOnline(Order order);
    void getOrderByPhone(Order order);
}
