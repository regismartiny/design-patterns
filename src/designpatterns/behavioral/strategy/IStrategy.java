package designpatterns.behavioral.strategy;

public interface IStrategy {
    PosicaoClienteDTO obterPosicaoCliente(long codigoCliente);
    String obterNomePosicao();
}
