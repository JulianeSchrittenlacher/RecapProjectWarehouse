package org.example;

import java.util.List;

public interface OrderRepo {

    void add();
    void remove();
    Order getOne();
    List getAll();
}
