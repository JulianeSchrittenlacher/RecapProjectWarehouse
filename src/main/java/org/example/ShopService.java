package org.example;

import java.time.LocalDate;

public class ShopService {

    Product plant1 = new Product(
            "PL001",
            "Rose",
            "Red",
            "A beautiful red rose",
            0.5,
            "GreenGarden Supplies",
            15
    );

    Product plant2 = new Product(
            "PL002",
            "Tulip",
            "Yellow",
            "A vibrant yellow tulip",
            0.3,
            "FlowerPower Co.",
            0
    );

    Product plant3 = new Product(
            "PL003",
            "Orchid",
            "Purple",
            "An elegant purple orchid",
            0.4,
            "Orchid World",
            3
    );

    Order order1 = new Order("ORD001", "John Doe", plant1, LocalDate.now(), "Pending");

    OrderListRepo orderlistrepo = new OrderListRepo();
    ProductRepo productrepo = new ProductRepo();

    //Warum kann ich hier nicht auf die add-Methode zugreifen?

    productrepo.add(plant1);
    productrepo.add(plant2);
    productrepo.add(plant3);

    orderlistrepo.add(order);

    public String orderSomething(Order order) {

//        OrderListRepo orderlistrepo = new OrderListRepo();
//        ProductRepo productrepo = new ProductRepo();


        if (order.product().equals(productrepo.getOne(order.product().id()))) {
            return "Order Successfully Added";
        }
        return "Order Failed";

    }

    public ShopService(ProductRepo productrepo, OrderListRepo orderlistrepo) {
        this.productrepo = productrepo;
        this.orderlistrepo = orderlistrepo;
    }
}
