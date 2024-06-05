package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    List<Order> orders = new ArrayList<>();


    @Override
    public void add(Order order) {
        orders.add(order);
    }

    @Override
    public void remove(Order order) {
        orders.remove(order);
    }

    @Override
    public Order getOne (String id) {
        for (Order order : orders) {
            if (order.orderId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    @Override
    public List<Order> getAll () {
        return orders;
    }
}
