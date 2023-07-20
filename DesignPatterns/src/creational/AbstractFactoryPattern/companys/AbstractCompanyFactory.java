package creational.AbstractFactoryPattern.companys;

public class AbstractCompanyFactory
{
    public static Company getCompany(String name)
    {
        if(name.equals("apple"))
            return new Apple();
        else
            return new Microsoft();
    }
}
