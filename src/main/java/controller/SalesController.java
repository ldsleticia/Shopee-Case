package controller;

import model.Sale;
import repository.SaleRepository;

public class SalesController {
    public static void insertSale(Sale sale) {
        SaleRepository.saveSale(sale);
    }

    public static void showSalesCallback() {
        SaleRepository.showSalesCallback();
    }
}
