package creational.PrototypePattern;

import java.util.HashMap;

public class CarRegistry
{
    private HashMap<String,Car> carShop;

    CarRegistry()
    {
        carShop=new HashMap<String,Car>();
    }

    public void addCar(String name,Car car)
    {
        carShop.put(name,car);
    }

    public Car getCar(String name)
    {
        return carShop.get(name).clone();
    }

}
