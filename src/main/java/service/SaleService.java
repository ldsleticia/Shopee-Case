package service;

import controller.SalesController;
import model.Sale;
import repository.SaleRepository;
import repository.SellerRepository;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaleService {
    public void readSaleInput() {
        Scanner scanner = new Scanner(System.in);
        Sale sale = new Sale();
        System.out.print("Type the Customer Name:   ");
        String customerName = scanner.nextLine();
        sale.setCustomerName(customerName);
        System.out.print("Type the Sale Item Name:  ");
        String saleItem = scanner.nextLine();
        sale.setSaleItemName(saleItem);
        System.out.print("Type the Sale Value:  ");
        String saleValue = scanner.nextLine();
        sale.setSaleValue(Double.parseDouble(saleValue));
        System.out.print("Type the Seller Name: ");
        final String sellerName = scanner.nextLine();
        System.out.print("Seller name is " + sellerName);
        sale.setSeller(SellerRepository.sellers.stream().filter(seller -> sellerName.equals(seller.getName())).findAny().orElseThrow());
        sale.getSeller().setSalesAmount(sale.getSeller().getSalesAmount() + 1);
        sale.getSeller().setAmountSalesValue(sale.getSeller().getAmountSalesValue() + sale.getSaleValue());
        SalesController.insertSale(sale);
    }

    public void orderSalesBySellerSalesAmount() {
        SaleRepository.sales = SaleRepository.sales.stream().sorted(Comparator.comparing(Sale::getSellerSalesAmount).reversed()).collect(Collectors.toList());
    }

    public void orderSalesBySellerAmountSalesValue() {
        SaleRepository.sales = SaleRepository.sales.stream().sorted(Comparator.comparing(Sale::getSellerValueSalesAmount).reversed()).collect(Collectors.toList());
    }
}
