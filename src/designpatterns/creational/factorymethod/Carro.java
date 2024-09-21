package designpatterns.creational.factorymethod;

public class Carro implements IFactory {

    public void dirigir(int kms) {
        System.out.printf("Dirigir o carro por %d\n", kms);
    }
}
