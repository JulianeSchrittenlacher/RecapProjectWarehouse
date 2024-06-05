package org.example;

import java.time.LocalDate;

public record Order(String oderId, String costumerName,
                    Product product, LocalDate dateOfOrder, String orderStatus ) {

}
