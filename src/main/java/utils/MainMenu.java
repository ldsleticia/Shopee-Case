package utils;

import controller.SalesController;
import controller.SellersController;
import model.Sale;
import repository.SellerRepository;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainMenu {
    public static Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {

        int menuOption = 0;

        while (menuOption != -1) {
            System.out.println("****************************************************************************");
            System.out.println("*----------------!!! Welcome to Shopee Marketplace Menu !!!----------------*");
            System.out.println("****************************************************************************");
            System.out.println("1 - Show Sellers");
            System.out.println("2 - Add Sale");
            System.out.println("3 - Show Sales Ranking");
            System.out.println("-1 - Exit From Marketplace");
            System.out.println("*************************************************************");
            System.out.println("Choose one of the options above by typing the corresponding value:");

            menuOption = scanner.nextInt();
            switch (menuOption) {
                case -1:
                    MenuUtils.clearScreen();
                    System.out.println("Thanks for using the marketplace shopee, see you soon!");
                    MenuUtils.clearScreen();
                case 1:
                    MenuUtils.clearScreen();
                    SellersController.showSellers();
                    break;
                case 2:
                    MenuUtils.clearScreen();
                    Sale sale = new Sale();
                    System.out.print("Type the Customer Name: ");
                    String customerName = scanner.nextLine();
                    sale.setCustomerName(customerName);
                    System.out.print("Type the Sale Item Name: ");
                    String saleItem = scanner.nextLine();
                    scanner.nextLine();
                    sale.setSaleItemName(saleItem);
                    System.out.print("Type the Sale Value: ");
                    String saleValue = scanner.nextLine();
                    scanner.nextLine();
                    sale.setSaleValue(new BigDecimal(saleValue));
                    System.out.print("Type the Seller Name: ");
                    String sellerName = scanner.nextLine();
                    scanner.next();
                    final String inputedSellerName = sellerName;
                    System.out.print("Seller name is " + inputedSellerName);
                    sale.setSeller(SellerRepository.sellers.stream().filter(seller -> inputedSellerName.equals(seller.getName())).findAny().orElseThrow());
                    sale.getSeller().setSalesAmount(sale.getSeller().getSalesAmount() + 1);
                    SalesController.insertSale(sale);
                    SalesController.showSalesCallback();
                    MenuUtils.clearScreen();
                    break;
                case 3:
                    MenuUtils.clearScreen();

                    break;
                default:
                    MenuUtils.clearScreen();
                    System.out.println("Incorrect option, please check available options and retype...");
                    MenuUtils.clearScreen();
            }
        }
    }
}
