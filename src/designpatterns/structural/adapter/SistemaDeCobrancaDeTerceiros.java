package designpatterns.structural.adapter;

public class SistemaDeCobrancaDeTerceiros {

    private IAlvo fonteDeFuncionarios;

    public SistemaDeCobrancaDeTerceiros(IAlvo fonteDeFuncionarios) {
        this.fonteDeFuncionarios = fonteDeFuncionarios;
    }

    public void exibirListaDeFuncionarios() {
        var funcionarios = fonteDeFuncionarios.obterListaDeFuncionarios();

        System.out.println("##### Lista de funcionários #####");

        funcionarios.forEach(System.out::print);
    }
}
