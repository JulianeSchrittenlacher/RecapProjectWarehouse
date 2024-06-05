package org.example;

public record Product(
        String id,
        String name,
        String color,
        String description,
        double weight,
        String supplierName,
        int quantityOnStock
) {}

