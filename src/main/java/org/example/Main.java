package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        OrderListRepo orderListRepo = new OrderListRepo();
        ProductRepo productRepo = new ProductRepo();

        ShopService shopService = new ShopService(productRepo,orderListRepo);



//        ProductRepo productRepo =new ProductRepo();
//        productRepo.add(plant1);
//        productRepo.add(plant2);
//        System.out.println(productRepo.getOne(plant1));
//        System.out.println(productRepo.getAll());
//        System.out.println();
//
//        Order order1 = new Order("ORD001", "John Doe", plant1, LocalDate.now(), "Pending");
//        Order order2 = new Order("ORD002", "Jane Smith", plant2, LocalDate.of(2024, 6, 5), "Delivered");
//        Order order3 = new Order("ORD003", "Alice Johnson", plant3, LocalDate.of(2024, 6, 6), "Shipped");
//
//        OrderListRepo orderListRepo = new OrderListRepo();
//        orderListRepo.add(order1);
//        orderListRepo.add(order2);
//        orderListRepo.add(order3);
//        System.out.println(orderListRepo.getOne(order1));
//        orderListRepo.remove(order1);
//        System.out.println(orderListRepo.getOne(order1));
//        System.out.println();
//        orderListRepo.remove(order2);
//        System.out.println(orderListRepo.getAll());
//        orderListRepo.remove(order3);







    }
}