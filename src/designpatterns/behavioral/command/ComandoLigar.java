package designpatterns.behavioral.command;

public class ComandoLigar implements IComando {

    private final Luz luz;

    public ComandoLigar(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        this.luz.ligar();
    }
}
