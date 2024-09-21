package designpatterns.decorator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class OfertaEspecial extends VeiculoDecorator {

    private int percentualDesconto;
    private String nomeOferta;

    public OfertaEspecial(IVeiculo veiculo) {
        super(veiculo);
    }

    public int getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public String getNomeOferta() {
        return nomeOferta;
    }

    public void setNomeOferta(String nomeOferta) {
        this.nomeOferta = nomeOferta;
    }

    public BigDecimal getPreco() {
        BigDecimal preco = super.getPreco();
        int percentual = 100 - this.percentualDesconto;
        BigDecimal novoPreco = preco
                .multiply(BigDecimal.valueOf(percentual))
                .divide(BigDecimal.valueOf(100), RoundingMode.DOWN);
        return novoPreco.round(new MathContext(2));
    }
}
