package utils;

import controller.SalesController;
import controller.SellersController;
import model.Sale;
import repository.SaleRepository;
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
            System.out.println("4 - Show Sales Ordered By Sales Amount");
            System.out.println("-1 - Exit From Marketplace");
            System.out.println("*************************************************************");
            System.out.println("Choose one of the options above by typing the corresponding value:");

            menuOption = scanner.nextInt();
            switch (menuOption) {
                case -1:
                    //MenuUtils.clearScreen();
                    System.out.println("Thanks for using the marketplace shopee, see you soon!");
                    //MenuUtils.clearScreen();
                    break;
                case 1:
                    //MenuUtils.clearScreen();
                    SellersController.showSellers();
                    break;
                case 2:
                    //MenuUtils.clearScreen();
                    SalesController.readSaleInput();
                    System.out.print("\n");
                    SalesController.showSalesCallback();
                    //MenuUtils.clearScreen();
                    break;
                case 3:
                    //MenuUtils.clearScreen();
                    SalesController.showSalesCallback();
                    break;
                case 4:
                    SalesController.showSalesBySellerSalesAmount();
                    break;
                default:
                    //MenuUtils.clearScreen();
                    System.out.println("Incorrect option, please check available options and retype...");
                    //MenuUtils.clearScreen();
            }
        }
    }
}
