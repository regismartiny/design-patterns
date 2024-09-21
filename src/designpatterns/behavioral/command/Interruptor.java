package designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Interruptor {

    private List<IComando> comandos = new ArrayList<>();

    public void armazenarEExecutar(IComando comando) {
        comandos.add(comando);
        comando.executar();
    }
}
