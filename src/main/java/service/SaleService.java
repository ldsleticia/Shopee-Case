package service;

import controller.SalesController;
import model.Sale;
import repository.SaleRepository;
import repository.SellerRepository;
import utils.DateTimeUtils;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SaleService {
    private final DateTimeUtils dateTimeUtils = new DateTimeUtils();

    public void readSaleInput() {
        Scanner scanner = new Scanner(System.in);
        Sale sale = new Sale();
        try {
            System.out.print("Type the Customer Name:   ");
            final String customerName = scanner.nextLine();
            sale.setCustomerName(customerName);
            System.out.print("Type the Sale Item Name:  ");
            final String saleItem = scanner.nextLine();
            sale.setSaleItemName(saleItem);
            System.out.print("Type the Sale Value:  ");
            final String saleValue = scanner.nextLine();
            sale.setSaleValue(Double.parseDouble(saleValue));
            System.out.print("Type the Seller Name: ");
            final String sellerName = scanner.nextLine();
            sale.setSaleDateTime(LocalDateTime.parse(dateTimeUtils.dateTimeFormatter(LocalDateTime.now())));
            sale.setSeller(SellerRepository.sellers.stream().filter(seller -> sellerName.equals(seller.getName())).findAny().orElseThrow());
            sale.getSeller().setSalesAmount(sale.getSeller().getSalesAmount() + 1);
            sale.getSeller().setAmountSalesValue(sale.getSeller().getAmountSalesValue() + sale.getSaleValue());
            SalesController.insertSale(sale);
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a positive and decimal numeric value!");
        } catch (NoSuchElementException nsee) {
            System.out.println("Please enter a valid seller. See option 1 to verify valid sellers!");
        }
    }

    public void orderSalesBySellerSalesAmount() {
        SaleRepository.sales = SaleRepository.sales.stream().sorted(Comparator.comparing(Sale::getSellerSalesAmount).reversed()).collect(Collectors.toList());
    }

    public void orderSalesBySellerAmountSalesValue() {
        SaleRepository.sales = SaleRepository.sales.stream().sorted(Comparator.comparing(Sale::getSellerValueSalesAmount).reversed()).collect(Collectors.toList());
    }
}
