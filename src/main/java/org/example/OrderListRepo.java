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
    public String getOne (Order order) {
        return orders.toString();
    }
    public String getAll () {
        return orders.toString();
    }
}
