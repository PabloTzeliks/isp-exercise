package model;

public class PedidoBase implements IPedido {

    private double valorProdutos;

    public PedidoBase(double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    @Override
    public double getValorFinal() {
        return valorProdutos;
    }

    @Override
    public String getNome() {
        return "Pedido Base";
    }
}
