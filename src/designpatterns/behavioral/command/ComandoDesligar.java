package designpatterns.behavioral.command;

public class ComandoDesligar implements IComando {

    private final Luz luz;

    public ComandoDesligar(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        this.luz.desligar();
    }
}
