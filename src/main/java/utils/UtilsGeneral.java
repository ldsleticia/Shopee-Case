package utils;

public class UtilsGeneral {
    public static void limparTela() {
//        try {
//            final String os = System.getProperty("os.name");
//            if (os.contains("Windows")) {
//                Runtime.getRuntime().exec("cls");
//            } else {
//                Runtime.getRuntime().exec("clear");
//            }
//        } catch (final Exception e) {
//            e.printStackTrace();
//        }
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
