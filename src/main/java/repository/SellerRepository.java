package repository;

import java.util.LinkedList;
import java.util.List;
import model.Seller;

public class SellerRepository {
    public static List<Seller> sellers = new LinkedList<>();

    public void showSellers() {
        for (Seller seller: this.sellers) {
            System.out.println(seller.getName());
        }
    }
}
