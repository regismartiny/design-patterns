package designpatterns.creational.factorymethod;

public class VeiculoFactoryConcreta extends VeiculoFactory {

    @Override
    public IFactory obterVeiculo(String veiculo) {
        return switch (veiculo) {
            case "Carro" -> new Carro();
            case "Caminhao" -> new Caminhao();
            default -> throw new IllegalArgumentException("Veículo " + veiculo + " não pode ser criado.");
        };
    }
}
