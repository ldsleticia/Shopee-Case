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
            System.out.println("2 - Comprar");
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
                    System.out.println("Digite o nome do vendedor que você deseja");
                    Utils.limparTela();
                    break;
                case 2:
                    Utils.limparTela();
                    System.out.println("Digite o código do produto que você quer comprar");
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


    //    public static void mostrarvendedores(){
//        String vendedor = new String();
//        if(vendedor == "antunes" || vendedor == "Antunes" || vendedor == "ANTUNES"){
//            lojaantunes.setNomeDoProduto("Batom");
//            lojaantunes.setIdProduto(1);
//            lojaantunes.setPrecodoProduro(3.99);
//            lojaantunes.setEstoque(3);
//        } else if(vendedor == "santos" || vendedor == "Santos" || vendedor == "SANTOS"){
//            lojasantos.setNomeDoProduto("Anel Cinderela");
//            lojasantos.setIdProduto(2);
//            lojasantos.setPrecodoProduro(10.00);
//            lojasantos.setEstoque(6);
//        } else if(vendedor == "ferreira" || vendedor == "Ferreira" || vendedor == "FERREIRA"){
//            lojaferreira.setNomeDoProduto("Chave de Fenda");
//            lojaferreira.setIdProduto(3);
//            lojaferreira.setPrecodoProduro(5.36);
//            lojaferreira.setEstoque(9);
//        } else if(vendedor == "salgueiro" || vendedor == "Salgueiro" || vendedor == "SALGUEIRO"){
//            lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
//            lojasalgueiro.setIdProduto(4);
//            lojasalgueiro.setPrecodoProduro(5.99);
//            lojasalgueiro.setEstoque(30);
//        } else if(vendedor == "figueira" || vendedor == "Figueira" || vendedor == "FIGUEIRA"){
//            lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
//            lojasalgueiro.setIdProduto(4);
//            lojasalgueiro.setPrecodoProduro(5.99);
//            lojasalgueiro.setEstoque(30);
//        } else{
//            System.out.println("Digite um vendedor válido");
//        }
//    }

}
