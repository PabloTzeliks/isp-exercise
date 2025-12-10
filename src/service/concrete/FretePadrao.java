package service.concrete;

import model.IPedido;
import service.PedidoDecorator;

public class FretePadrao extends PedidoDecorator {

    private double valorFrete;

    public FretePadrao(IPedido pedidoBase, double valorFrete) {

        super(pedidoBase);

        if (valorFrete < 0) {

            throw new IllegalArgumentException("Valor inválido para o Frete Padrão.");
        }

        this.valorFrete = valorFrete;
    }

    @Override
    public double getValorFinal() {
        return pedidoBase.getValorFinal() + valorFrete;
    }

    @Override
    public String getNome() {
        return pedidoBase.getNome() + " | Frete: Padrão | Valor Frete: [ R$" + valorFrete + " ]";
    }

}