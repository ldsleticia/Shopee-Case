package controller;

import utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menuPrincipal();
    }

    //MENU PRINCIPAL
    private static void menuPrincipal() {
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
                    Utils.limparTela();
                    System.out.println("Volte Sempre!!");
                    System.exit(0);
                    break;
                case 1:
                    Utils.limparTela();
                    mostrarProdutos();
                    //?System.out.println("Escolha o produto desejado");
                    //Scanner sc = new Scanner(System.in);
//                    Utils.limparTela();
                    break;
                case 2:
                    Utils.limparTela();
                    //System.out.println("Digite o código do produto que você quer comprar");
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

        }while (opcao != -1);
    }

    public static void mostrarProdutos(){
        Produto lojaantunes = new Produto();
        lojaantunes.setNomeDoProduto("Batom");
        lojaantunes.setIdProduto(1);
        lojaantunes.setPrecodoProduro(3.99);
        lojaantunes.setEstoque(3);
        System.out.println(lojaantunes.toString());

        Produto lojasantos = new Produto();
        lojasantos.setNomeDoProduto("Anel Cinderela");
        lojasantos.setIdProduto(2);
        lojasantos.setPrecodoProduro(10.00);
        lojasantos.setEstoque(6);
        System.out.println(lojasantos.toString());

        Produto lojaferreira = new Produto();
        lojaferreira.setNomeDoProduto("Chave de Fenda");
        lojaferreira.setIdProduto(3);
        lojaferreira.setPrecodoProduro(5.36);
        lojaferreira.setEstoque(9);
        System.out.println(lojaferreira.toString());

        Produto lojasalgueiro = new Produto();
        lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
        lojasalgueiro.setIdProduto(4);
        lojasalgueiro.setPrecodoProduro(5.99);
        lojasalgueiro.setEstoque(30);
        System.out.println(lojasalgueiro.toString());

        Produto lojafigueira = new Produto();
        lojafigueira.setNomeDoProduto("Figo em conserva");
        lojafigueira.setIdProduto(5);
        lojafigueira.setPrecodoProduro(12.35);
        lojafigueira.setEstoque(10);
        System.out.println(lojafigueira.toString());
    }
}
