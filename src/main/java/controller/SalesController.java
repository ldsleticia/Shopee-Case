package controller;

import model.Sale;
import repository.SaleRepository;
import service.SaleService;

public class SalesController {
    private static final SaleService saleService = new SaleService();

    public static void insertSale(Sale sale) {
        SaleRepository.saveSale(sale);
    }

    public static void showSalesCallback() {
        saleService.orderSalesBySellerAmountSalesValue();
        SaleRepository.showSales();
    }

    public static void readSaleInput() {
        saleService.readSaleInput();
    }

    public static void showSalesBySellerSalesAmount() {
        saleService.orderSalesBySellerSalesAmount();
        SaleRepository.showSales();
    }
}
