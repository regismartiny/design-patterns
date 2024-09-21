package designpatterns;

import designpatterns.decorator.HondaCivic;
import designpatterns.decorator.OfertaEspecial;

public class Main {
    public static void main(String[] args) {
        exemploPadraoDecorator();
    }

    private static void exemploPadraoDecorator() {

        HondaCivic carro = new HondaCivic();

        OfertaEspecial oferta = new OfertaEspecial(carro);
        oferta.setPercentualDesconto(25);
        oferta.setNomeOferta("25% de desconto");

        System.out.printf("Oferta %s %s de %s por %s (%s!)",
                oferta.getFabricante(),
                oferta.getModelo(),
                carro.getPreco().toPlainString(),
                oferta.getPreco().toPlainString(),
                oferta.getNomeOferta());

    }
}