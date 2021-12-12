package model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Sale {

    private String customerName;

    private String saleItemName;

    private LocalDateTime saleDateTime;

    private Double saleValue;

    private Seller seller;

    public Long getSellerSalesAmount() {
        return this.seller.getSalesAmount();
    }

    public Double getSellerValueSalesAmount() {
        return this.seller.getAmountSalesValue();
    }

}
