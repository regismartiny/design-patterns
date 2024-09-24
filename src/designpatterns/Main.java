package designpatterns;

import java.util.Scanner;

import designpatterns.behavioral.command.ComandoDesligar;
import designpatterns.behavioral.command.ComandoLigar;
import designpatterns.behavioral.command.IComando;
import designpatterns.behavioral.command.Interruptor;
import designpatterns.behavioral.command.Luz;
import designpatterns.behavioral.strategy.Contexto;
import designpatterns.behavioral.strategy.PosicaoAcoes;
import designpatterns.behavioral.strategy.PosicaoFundos;
import designpatterns.behavioral.templatemethod.ClasseConcreta1;
import designpatterns.behavioral.templatemethod.ClasseConcreta2;
import designpatterns.behavioral.templatemethod.Cliente;
import designpatterns.creational.factorymethod.IFactory;
import designpatterns.creational.factorymethod.VeiculoFactoryConcreta;
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
        exemploCommand();
        exemploFactoryMethod();
        exemploStrategy();
        exemploTemplateMethod();
    }

    private static void exemploTemplateMethod() {
        System.out.println("Mesmo código de cliente pode funcionar com diferentes subclasses:");
        System.out.println("Subclasse ClasseConcreta1:");
        Cliente.codigoCliente(new ClasseConcreta1());
        System.out.println();
        System.out.println("Subclasse ClasseConcreta2:");
        Cliente.codigoCliente(new ClasseConcreta2());
    }

    private static void exemploStrategy() {
        var contexto = new Contexto();
        contexto.setStrategy(new PosicaoAcoes());
        contexto.obterPosicaoCliente(335962);
        contexto.setStrategy(new PosicaoFundos());
        contexto.obterPosicaoCliente(335962);
    }

    private static void exemploFactoryMethod() {

        var factory = new VeiculoFactoryConcreta();

        IFactory carro = factory.obterVeiculo("Carro");
        carro.dirigir(10);

        IFactory caminhao = factory.obterVeiculo("Caminhao");
        caminhao.dirigir(20);
    }

    private static void exemploCommand() {
        System.out.println("Insira um comando (\"ON/OFF\")");

        Scanner ler = new Scanner(System.in);
        String cmd = ler.next();

        Luz lampada = new Luz();

        IComando ligar = new ComandoLigar(lampada);
        IComando desligar = new ComandoDesligar(lampada);

        Interruptor interruptor = new Interruptor();

        switch (cmd) {
            case "ON":
                interruptor.armazenarEExecutar(ligar);
                break;
            case "OFF":
                interruptor.armazenarEExecutar(desligar);
                break;
            default:
                System.out.println("Comando \"ON\" ou \"OFF\" é necessário");
        }
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