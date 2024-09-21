package designpatterns;

import designpatterns.structural.adapter.FuncionarioAdapter;
import designpatterns.structural.adapter.IAlvo;
import designpatterns.structural.adapter.SistemaDeCobrancaDeTerceiros;
import designpatterns.structural.decorator.HondaCivic;
import designpatterns.structural.decorator.OfertaEspecial;
import designpatterns.structural.proxy.ProxyCliente;

public class Main {
    public static void main(String[] args) {
        exemploPadraoDecorator();
        exemploPadraoProxy();
        exemploAdapter();
    }

    private static void exemploAdapter() {
        IAlvo iAlvo = new FuncionarioAdapter();

        SistemaDeCobrancaDeTerceiros cliente = new SistemaDeCobrancaDeTerceiros(iAlvo);

        cliente.exibirListaDeFuncionarios();
    }

    private static void exemploPadraoProxy() {

        var proxy = new ProxyCliente();

        System.out.printf("\nDados do Proxy Cliente = %s\n", proxy.getDados());
    }

    private static void exemploPadraoDecorator() {

        HondaCivic carro = new HondaCivic();

        OfertaEspecial oferta = new OfertaEspecial(carro);
        oferta.setPercentualDesconto(25);
        oferta.setNomeOferta("25% de desconto");

        System.out.printf("\nOferta %s %s de %s por %s (%s!)\n",
                oferta.getFabricante(),
                oferta.getModelo(),
                carro.getPreco().toPlainString(),
                oferta.getPreco().toPlainString(),
                oferta.getNomeOferta());

    }
}