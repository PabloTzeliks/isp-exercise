package service.concrete;

import model.IPedido;
import service.PedidoDecorator;

public class FreteGratis extends PedidoDecorator {

    public FreteGratis(IPedido pedidoBase) {

        super(pedidoBase);
    }

    @Override
    public double getValorFinal() {
        return pedidoBase.getValorFinal();
    }

    @Override
    public String getNome() {
        return pedidoBase.getNome() + " | Frete: Gratis";
    }
}
