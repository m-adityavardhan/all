package creational.AbstractFactoryPattern.os;

public class OsFactory
{
    public static Os getos(String name)
    {
        if(name.equals("ios"))
            return new Ios();
        else
            return new Windows();
    }
}
