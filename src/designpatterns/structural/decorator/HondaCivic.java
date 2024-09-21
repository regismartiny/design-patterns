package designpatterns.structural.decorator;

import java.math.BigDecimal;

public class HondaCivic implements IVeiculo {

    public String getFabricante() {
        return "Honda";
    }

    public String getModelo() {
        return "Civic";
    }

    public BigDecimal getPreco() {
        return BigDecimal.valueOf(100_000);
    }
}
