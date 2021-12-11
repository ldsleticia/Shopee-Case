package model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Sale {

    private String customerName;

    private String saleItemName;

    private BigDecimal saleValue;

    private Seller seller;

}
