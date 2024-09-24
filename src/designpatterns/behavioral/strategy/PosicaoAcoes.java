package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class PosicaoAcoes implements IStrategy {

    public PosicaoClienteDTO obterPosicaoCliente(long codigoCliente) {
        if (codigoCliente <= 0) {
            throw new IllegalArgumentException("codigoCliente inválido");
        }

        return new PosicaoClienteDTO(obterNomePosicao() + " cliente " + codigoCliente, BigDecimal.valueOf(20_000));
    }

    @Override
    public String obterNomePosicao() {
        return "Ações";
    }
}
