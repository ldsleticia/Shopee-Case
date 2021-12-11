import controller.SellersController;
import repository.SellerRepository;
import utils.MainMenu;

public class Main {
    public static void main(String[] args) {
        SellerRepository.sellers = SellersController.insertSellers();
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
    }
}
