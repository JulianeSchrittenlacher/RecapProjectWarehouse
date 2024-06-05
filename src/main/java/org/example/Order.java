package org.example;

import java.time.LocalDate;

public record Order(String orderId, String costumerName,
                    Product product, LocalDate dateOfOrder, String orderStatus) {

}
