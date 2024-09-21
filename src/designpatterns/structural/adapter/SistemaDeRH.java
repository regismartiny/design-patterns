package designpatterns.structural.adapter;

public class SistemaDeRH {

    public String[][] obterFuncionarios() {
        String[][] funcionarios = new String[4][];

        funcionarios[0] = new String[] {"1", "Eduardo Santos", "Gestor Técnico"};
        funcionarios[1] = new String[] {"2", "João Silva", "Líder de Engenharia"};
        funcionarios[2] = new String[] {"3", "André Oliveira", "Desenvolvedor Sênior"};
        funcionarios[3] = new String[] {"4", "Júlia Soares", "Analista de Qualidade Sênior"};

        return funcionarios;
    }
}
