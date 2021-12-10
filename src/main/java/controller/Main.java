package controller;

import models.Vendedor;
import utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Vendedor antunes = new Vendedor();
        antunes.nomeVendedor = "Antunes Cosméticos";

        Vendedor santos = new Vendedor();
        santos.nomeVendedor = "Santos Jóias";

        Vendedor ferreira = new Vendedor();
        ferreira.nomeVendedor = "Ferreira Ferragens";

        Vendedor salgueiro = new Vendedor();
        salgueiro.nomeVendedor = "Salgueiro Salgados";

        Vendedor figueira = new Vendedor();
        figueira.nomeVendedor = "Figueira Figos";

        menuPrincipal();
    }

    //MENU PRINCIPAL
    private static void menuPrincipal() {
        Scanner menu = new Scanner(System.in);
        int opcao;

        do {System.out.println("*************************************************************");
            System.out.println("*----------------!! COMPRE DE TUDO !!----------------*");
            System.out.println("*************************************************************");
            System.out.println("1 - Mostrar Vendedores");
            System.out.println("2 - Mostrar Produtos");
            System.out.println("3 - Sacola");
            System.out.println("4 - Confirmar compra");
            System.out.println("*************************************************************");
            System.out.println("Digite uma opção de 1 a 4 ou digite 0 para sair: ");

            opcao = menu.nextInt();
            switch (opcao){
                case 0:
                    Utils.limparTela();
                    System.out.println("Volte Sempre!!");
                    System.exit(0);
                    break;
                case 1:
                    Utils.limparTela();
                    //mostrarvendedores();
                    Utils.limparTela();
                    break;
                case 2:
                    Utils.limparTela();
                    //mostrarprodutodovendedorsolicitado();
                    Utils.limparTela();
                    break;
                case 3:
                    Utils.limparTela();
                    //mostrarsacolacomitensescolhidos();
                    Utils.limparTela();
                case 4:
                    Utils.limparTela();
                    System.out.println("Obrigada por comprar conosco");
                    System.exit(0);
                    break;

                    //if(sacola = comprafinalizada || sacola = sacolavazia){
                    //System.out.println("Carrinho vazio!!);
                    //}
            }

        }while (opcao != 0);
    }
}
