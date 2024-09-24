package designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public record PosicaoClienteDTO(
        String nome,
        BigDecimal valor
) {
}
