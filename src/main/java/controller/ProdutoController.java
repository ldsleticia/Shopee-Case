package controller;

import models.Produto;

import java.util.TreeSet;

public class ProdutoController {
    public static TreeSet<Produto> getProdutos() {
        TreeSet<Produto> produtos = new TreeSet<>();

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

        return produtos;
    }
}
