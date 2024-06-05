package org.example;

import java.util.List;

public interface OrderRepo {

    void add(Order order);
    void remove(Order order);
    Order getOne(String id);
    List<Order> getAll();
}
