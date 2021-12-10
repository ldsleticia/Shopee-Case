package models;

import java.time.LocalDate;
import java.util.TreeSet;

public class Compras {
    private double valorTotalDaCompra;
    private TreeSet<Venda> produtos = new TreeSet<>();
    private LocalDate data = LocalDate.now();
    private boolean compraFinalizada = false;

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public void setValorTotalDaCompra(double valorTotalDaCompra) {
        this.valorTotalDaCompra = valorTotalDaCompra;
    }

    public TreeSet<Venda> getProdutos() {
        return produtos;
    }

    public void setProdutos(TreeSet<Venda> produtos) {
        this.produtos = produtos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isCompraFinalizada() {
        return compraFinalizada;
    }

    public void setCompraFinalizada(boolean compraFinalizada) {
        this.compraFinalizada = compraFinalizada;
    }
}
