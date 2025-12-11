import model.IPedido;
import model.PedidoBase;
import service.concrete.FreteGratis;
import service.concrete.FretePadrao;

public class Main {
    public static void main(String[] args) {

        IPedido p1 = new PedidoBase(1000);
        p1 = new FretePadrao(p1, 34.25);

        IPedido p2 = new PedidoBase(150);
        p2 = new FreteGratis(p2);

        System.out.println(p1.getNome());
        System.out.println(p1.getValorFinal());

        System.out.println();

        System.out.println(p2.getNome());
        System.out.println(p2.getValorFinal());

    }
}