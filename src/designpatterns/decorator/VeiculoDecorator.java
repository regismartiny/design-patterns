package designpatterns.decorator;

import java.math.BigDecimal;

public abstract class VeiculoDecorator implements IVeiculo {

    private final IVeiculo veiculo;

    protected VeiculoDecorator(IVeiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getFabricante() {
        return this.veiculo.getFabricante();
    }

    public String getModelo() {
        return this.veiculo.getModelo();
    }

    public BigDecimal getPreco() {
        return this.veiculo.getPreco();
    }
}
