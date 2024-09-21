package designpatterns.creational.factorymethod;

public class Caminhao implements IFactory {

    public void dirigir(int kms) {
        System.out.printf("Dirigir o caminhão por %d\n", kms);
    }
}
