package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
        /*
        Create a class ProductRepo that contains a list of Product objects.

    Step 1: Create a record Product with the necessary attributes.
    Step 2: Implement the ProductRepo class with a list to store products.
    Step 3: Implement methods to add, remove, and get products (single product and all products).
         */



    List<Product> allProducts = new ArrayList<>();

    public List<Product> getAllProducts() {
        return allProducts;
    }

    public void add(Product product) {
            allProducts.add(product);
        }
        public void remove(Product product) {
            allProducts.remove(product);
        }
        public Product getOne (String id) {
            for (Product product : allProducts) {
                if (product.id().equals(id)) {
                    return product;
                }
            }
            return null;
        }
        public List<Product> getAll () {
            return allProducts;
        }

}




