package org.example;

import java.time.LocalDate;

public class ShopService {



    //Order order1 = new Order("ORD001", "John Doe", plant1, LocalDate.now(), "Pending");

    OrderListRepo orderListRepo;
    ProductRepo productRepo;

    public ShopService(OrderListRepo orderListRepo, ProductRepo productRepo) {
        this.orderListRepo = orderListRepo;
        this.productRepo = productRepo;
    }


    public void orderSomething(String orderId, String costumerName,
                               Product product, LocalDate dateOfOrder, String orderStatus) {

        Order order = new Order(orderId, costumerName, product, dateOfOrder, orderStatus);
        orderListRepo.add(order);


        if (order.product().equals(productRepo.getOne(order.product().id()))) {
            System.out.println("Order sucessfully created");
        } else {
            System.out.println("Order failed");
        }


    }



    //Warum kann ich hier nicht auf die add-Methode zugreifen? In der Main geht das!

//    productRepo.add(plant1);
//    productRepo.add(plant2);
//    productRepo.add(plant3);
//
//    orderlistRepo.add(order);

//    public String orderSomething(Order order) {
//
////        OrderListRepo orderlistrepo = new OrderListRepo();
////        ProductRepo productrepo = new ProductRepo();
//
//
//        if (order.product().equals(productrepo.getOne(order.product().id()))) {
//            return "Order Successfully Added";
//        }
//        return "Order Failed";
//
//    }


}
