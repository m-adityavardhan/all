package creational.AbstractFactoryPattern.os;

public class Windows implements Os {
    @Override
    public void run() {
        System.out.println("Booting windows os");
    }
}
