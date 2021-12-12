package controller;

import model.Seller;
import repository.SellerRepository;

import java.util.LinkedList;
import java.util.List;

public class SellersController {
    private static final String[] NAMES = {"The Doctor", "Sarah Connor", "Luke Skywalker", "Arthur Dent", "Leia Organa"};
    private static final Long INITIAL_SALES_AMOUNT = 0L;
    private static final Double INITIAL_AMOUNT_SALES_VALUE = 0.0;

    public static List<Seller> insertSellers() {
        Seller seller = new Seller();
        seller.setName(NAMES[0]);
        seller.setSalesAmount(INITIAL_SALES_AMOUNT);
        seller.setAmountSalesValue(INITIAL_AMOUNT_SALES_VALUE);
        Seller seller1 = new Seller();
        seller1.setName(NAMES[1]);
        seller1.setSalesAmount(INITIAL_SALES_AMOUNT);
        seller1.setAmountSalesValue(INITIAL_AMOUNT_SALES_VALUE);
        Seller seller2 = new Seller();
        seller2.setName(NAMES[2]);
        seller2.setSalesAmount(INITIAL_SALES_AMOUNT);
        seller2.setAmountSalesValue(INITIAL_AMOUNT_SALES_VALUE);
        Seller seller3 = new Seller();
        seller3.setName(NAMES[3]);
        seller3.setSalesAmount(INITIAL_SALES_AMOUNT);
        seller3.setAmountSalesValue(INITIAL_AMOUNT_SALES_VALUE);
        Seller seller4 = new Seller();
        seller4.setName(NAMES[4]);
        seller4.setSalesAmount(INITIAL_SALES_AMOUNT);
        seller4.setAmountSalesValue(INITIAL_AMOUNT_SALES_VALUE);
        List<Seller> sellers = new LinkedList<>();
        sellers.add(seller);
        sellers.add(seller1);
        sellers.add(seller2);
        sellers.add(seller3);
        sellers.add(seller4);
        return sellers;
    }

    public static void showSellers() {
        SellerRepository sellerRepository = new SellerRepository();
        sellerRepository.showSellers();
    }
}
