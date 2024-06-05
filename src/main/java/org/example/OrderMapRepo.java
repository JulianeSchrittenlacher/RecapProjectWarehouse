package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<String,Order> orders = new HashMap();

    @Override
    public void add(Order order) {
        orders.put(order.orderId(),order);
    }

    @Override
    public void remove(Order order) {
        orders.remove(order.orderId());
    }

    @Override
    public Order getOne(String id) {
        return orders.get(id);
    }

    @Override
    public List<Order> getAll () {
        List<Order> orderList = new ArrayList();
        orderList.addAll(orders.values());
        return orderList;
    }
}
