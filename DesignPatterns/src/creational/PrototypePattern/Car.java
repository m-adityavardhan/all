package creational.PrototypePattern;

public interface Car extends Cloneable
{
    public void addTyres();
    public void addEngine();
    public void addRoof();
    public Car clone();
}
