package designpatterns.structural.proxy;

public class Cliente implements ICliente {

    private final String data;

    public Cliente() {
        System.out.println("Cliente: inicializado");
        data = "Dados do cliente";
    }

    @Override
    public String getDados() {
        return data;
    }
}
