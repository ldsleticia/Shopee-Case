package controller;

import models.Produto;
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

        Produto lojaantunes = new Produto();
        lojaantunes.setNomeDoProduto("Batom");
        lojaantunes.setIdProduto(1);
        lojaantunes.setPrecodoProduro(3.99);
        lojaantunes.setEstoque(3);

        Produto lojasantos = new Produto();
        lojasantos.setNomeDoProduto("Anel Cinderela");
        lojasantos.setIdProduto(2);
        lojasantos.setPrecodoProduro(10.00);
        lojasantos.setEstoque(6);

        Produto lojaferreira = new Produto();
        lojaferreira.setNomeDoProduto("Chave de Fenda");
        lojaferreira.setIdProduto(3);
        lojaferreira.setPrecodoProduro(5.36);
        lojaferreira.setEstoque(9);

        Produto lojasalgueiro = new Produto();
        lojasalgueiro.setNomeDoProduto("Coxinha Congelada");
        lojasalgueiro.setIdProduto(4);
        lojasalgueiro.setPrecodoProduro(5.99);
        lojasalgueiro.setEstoque(30);

        Produto lojafigueira = new Produto();
        lojafigueira.setNomeDoProduto("Figo em conserva");
        lojafigueira.setIdProduto(5);
        lojafigueira.setPrecodoProduro(12.35);
        lojafigueira.setEstoque(10);

        menuPrincipal();
    }

    //MENU PRINCIPAL
    private static void menuPrincipal() {
        Scanner menu = new Scanner(System.in);
        int opcao = 0;

        do {System.out.printf("*************************************************************\n");
            System.out.printf("*----------------!! COMPRE DE TUDO !!----------------*\n");
            System.out.printf("*************************************************************\n");
            System.out.println("1 - Mostrar Vendedores");
            System.out.println("2 - Mostrar Produtos");
            System.out.println("3 - Sacola");
            System.out.println("4 - Confirmar compra");
            System.out.printf("*************************************************************\n");
            System.out.printf("Digite uma opção de 1 a 4 ou digite 0 para sair: ");

            opcao = menu.nextInt();
            switch (opcao){
                case 0: //Sair da applicação
                    Utils.limparTela();
                    System.out.printf("Volte Sempre!!");
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
                    Utils.limparTela();;
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
