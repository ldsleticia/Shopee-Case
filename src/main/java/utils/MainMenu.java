package utils;

import java.util.Scanner;

public class MainMenu {
    public static void menuPrincipal() {
        Scanner menu = new Scanner(System.in);
        int opcao;

        do {System.out.println("*************************************************************");
            System.out.println("*----------------!! COMPRE DE TUDO !!----------------*");
            System.out.println("*************************************************************");
            System.out.println("1 - Mostrar Produtos");
            System.out.println("2 - Comprar");
            System.out.println("3 - Sacola");
            System.out.println("4 - Confirmar compra");
            System.out.println("*************************************************************");
            System.out.println("Digite uma opção de 1 a 4 ou digite 0 para sair: ");

            opcao = menu.nextInt();
            switch (opcao){
                case 0:
                    UtilsGeneral.limparTela();
                    System.out.println("Volte Sempre!!");
                    System.exit(0);
                    break;
                case 1:
                    UtilsGeneral.limparTela();
                    //?System.out.println("Escolha o produto desejado");
                    //Scanner sc = new Scanner(System.in);
//                    UtilsGeneral.limparTela();
                    break;
                case 2:
                    UtilsGeneral.limparTela();
                    //System.out.println("Digite o código do produto que você quer comprar");
                    UtilsGeneral.limparTela();
                    break;
                case 3:
                    UtilsGeneral.limparTela();
                    //mostrarsacolacomitensescolhidos();
                    UtilsGeneral.limparTela();
                case 4:
                    UtilsGeneral.limparTela();
                    System.out.println("Obrigada por comprar conosco");
                    System.exit(0);
                    break;

                //if(sacola = comprafinalizada || sacola = sacolavazia){
                //System.out.println("Carrinho vazio!!);
                //}
            }

        }while (opcao != -1);
    }

}
