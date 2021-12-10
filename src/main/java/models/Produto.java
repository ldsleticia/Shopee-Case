package models;

public class Produto {
    private String nomeDoProduto;
    private Integer idProduto;
    private double precodoProduro;
    private Integer estoque;


    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public double getPrecodoProduro() {
        return precodoProduro;
    }

    public void setPrecodoProduro(double precodoProduro) {
        this.precodoProduro = precodoProduro;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
}
