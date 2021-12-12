package model;

import lombok.Data;

@Data
public class Sale {

    private String customerName;

    private String saleItemName;

    private Double saleValue;

    private Seller seller;

    public Long getSellerSalesAmount() {
        return this.seller.getSalesAmount();
    }

    public Double getSellerValueSalesAmount() {
        return this.seller.getAmountSalesValue();
    }

}
