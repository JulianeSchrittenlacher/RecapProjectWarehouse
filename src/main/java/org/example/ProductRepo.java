package org.example;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {
    /*
    Create a class ProductRepo that contains a list of Product objects.

Step 1: Create a record Product with the necessary attributes.
Step 2: Implement the ProductRepo class with a list to store products.
Step 3: Implement methods to add, remove, and get products (single product and all products).
     */
List<Product> allProducts = new ArrayList<>();

public void add(Product product) {
    allProducts.add(product);
}
public void remove(Product product) {
    allProducts.remove(product);
}
public String getOne (Product product) {
        return product.toString();
}
public String getAll () {
        return allProducts.toString();
}




//
//    Map<String,Product> allProducts= new HashMap<>();
//
//    public void add (Product product) {
//        allProducts.put(product.id(),product);
//    }
//    public void remove (Product product) {
//        allProducts.remove(product.id());
//    }
//    public String getOne (Product product) {
//        return product.toString();
//    }
//    public String getAll () {
//        return allProducts.toString();
//    }
//


}
