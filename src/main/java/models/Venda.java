package models;

public class Venda extends Vendedor {
    private double precoDoProduto;
    private Integer qtdComprada;
    private Integer totalDaCompra;

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public Integer getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(Integer qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public Integer getTotalDaCompra() {
        return totalDaCompra;
    }

    public void setTotalDaCompra(Integer totalDaCompra) {
        this.totalDaCompra = totalDaCompra;
    }
}
