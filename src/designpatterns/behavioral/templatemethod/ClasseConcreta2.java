package designpatterns.behavioral.templatemethod;

public class ClasseConcreta2 extends ClasseAbstrata {
    @Override
    protected void operacoesNecessarias1() {
        System.out.println(this.getClass().getSimpleName() + ": Realizando operações necessárias 1");
    }

    @Override
    protected void operacoesNecessarias2() {
        System.out.println(this.getClass().getSimpleName() + ": Realizando operações necessárias 2");
    }
}
