package service;

import model.IPedido;

public abstract class PedidoDecorator implements IPedido {

    protected IPedido pedidoBase;

    public PedidoDecorator(IPedido pedidoBase) {
        this.pedidoBase = pedidoBase;
    }

    @Override
    public double getValorFinal() {
        return pedidoBase.getValorFinal();
    }

    @Override
    public String getNome() {
        return pedidoBase.getNome();
    }
}
