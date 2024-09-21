package designpatterns.structural.proxy;

public class ProxyCliente implements ICliente {
    private final Cliente cliente = new Cliente();

    public ProxyCliente() {
        System.out.println("ProxyCliente: inicializado");
    }

    @Override
    public String getDados() {
        return cliente.getDados();
    }
}
