package repository;

import model.Sale;

import java.util.LinkedList;
import java.util.List;

public class SaleRepository {
    public static List<Sale> sales = new LinkedList<>();

    public static void saveSale(Sale sale) {
        sales.add(sale);
    }

    public static void showSalesCallback() {
        for (Sale sale: sales) {
            System.out.println(sale.toString());
        }
    }
}
