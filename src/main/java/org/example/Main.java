package org.example;

public class Main {
    public static void main(String[] args) {

        Product plant1 = new Product(
                "PL001",
                "Rose",
                "Red",
                "A beautiful red rose",
                0.5,
                "GreenGarden Supplies"
        );

        Product plant2 = new Product(
                "PL002",
                "Tulip",
                "Yellow",
                "A vibrant yellow tulip",
                0.3,
                "FlowerPower Co."
        );

        Product plant3 = new Product(
                "PL003",
                "Orchid",
                "Purple",
                "An elegant purple orchid",
                0.4,
                "Orchid World"
        );

        ProductRepo productRepo =new ProductRepo();
        productRepo.add(plant1);
        productRepo.add(plant2);


        System.out.println(productRepo.getOne(plant1));
        System.out.println(productRepo.getAll());
        System.out.println(productRepo.getAll());





    }
}