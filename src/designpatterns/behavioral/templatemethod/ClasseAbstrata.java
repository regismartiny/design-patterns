package designpatterns.behavioral.templatemethod;

public abstract class ClasseAbstrata {

    public void metodoTemplate() {
        this.operacaoBase1();
        this.operacoesNecessarias1();
        this.operacaoBase2();
        this.operacoesNecessarias2();
    }

    protected void operacaoBase1() {
        System.out.println("Realizando operações base 1");
    }

    protected void operacaoBase2() {
        System.out.println("Realizando operações base 2");
    }

    protected abstract void operacoesNecessarias1();

    protected abstract void operacoesNecessarias2();
}
