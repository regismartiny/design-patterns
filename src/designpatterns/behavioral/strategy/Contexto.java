package designpatterns.behavioral.strategy;

public class Contexto {
    private IStrategy strategy;

    public Contexto() {
    }

    public Contexto(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void obterPosicaoCliente(long codigoCliente) {
        var resultado = this.strategy.obterPosicaoCliente(codigoCliente);
        System.out.printf("%s - Posição %s\n", resultado.nome(), resultado.valor());
    }
}
