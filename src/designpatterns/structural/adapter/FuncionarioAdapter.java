package designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioAdapter extends SistemaDeRH implements IAlvo {

    @Override
    public List<String> obterListaDeFuncionarios() {

        var listaDeFuncionarios = new ArrayList<String>();

        var funcionarios = obterFuncionarios();

        for (String[] funcionario : funcionarios) {
            listaDeFuncionarios.add(funcionario[0]);
            listaDeFuncionarios.add(",");
            listaDeFuncionarios.add(funcionario[1]);
            listaDeFuncionarios.add(",");
            listaDeFuncionarios.add(funcionario[2]);
            listaDeFuncionarios.add("\n");
        }

        return listaDeFuncionarios;
    }
}
