import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static utils.MainMenu.menuPrincipal;
import model.*;
import controller.*;
import repository.SellerRepository;

public class Main {
    public static void main(String[] args) {

        //menuPrincipal();
        SellerRepository sellerRepository = new SellerRepository();
        sellerRepository.sellers = InsertSellersController.insertSellers();
        //TODO insert it in seller menu dinamic
        for (Seller seller: sellerRepository.sellers) {
            System.out.println(seller.getName());
        }
        List<Sale> sales = new LinkedList<>();

        Sale sale = new Sale();
        sale.setCustomerName("jdklf");
        sale.setSaleValue(new BigDecimal("900.00"));
        sale.setSaleItemName("venda1");
        String name = "Leia Organa";
        sale.setSeller(sellerRepository.sellers.stream().filter( seller -> name.equals(seller.getName())).findAny().orElseThrow());
        sale.getSeller().setSalesAmount(sale.getSeller().getSalesAmount() + 1);

        Sale sale1 = new Sale();
        sale1.setCustomerName("jdklf");
        sale1.setSaleValue(new BigDecimal("900.00"));
        sale1.setSaleItemName("venda2");
        //TODO set sale name by variable
        sale1.setSeller(sellerRepository.sellers.stream().filter( seller -> name.equals(seller.getName())).findAny().orElseThrow());
        sale1.getSeller().setSalesAmount(sale1.getSeller().getSalesAmount() + 1);

        sales.add(sale);
        sales.add(sale1);


        // TODO Use this in sale print controller or service
        for (Sale saleIt: sales) {
            System.out.println(saleIt.toString());
        }

    }

}
