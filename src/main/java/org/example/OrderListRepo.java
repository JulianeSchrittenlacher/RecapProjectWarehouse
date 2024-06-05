package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }
    public void remove(Order order) {
        orders.remove(order);
    }
    public Order getOne (Order order) {
        return order;
    }
    public List getAll () {
        return orders;
    }
}
