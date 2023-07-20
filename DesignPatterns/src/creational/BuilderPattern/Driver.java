package creational.BuilderPattern;

public class Driver
{
    public static void main(String[] args)
    {
        Filters.FilterBuilder builder=new Filters.FilterBuilder(1);
        Filters filters=builder.setBrand("lenovo").setPrice(50000).getFilter();

        System.out.println("filters set are: "+filters);

        System.out.println();
        Filters filters2=builder.setBrand("apple").setPrice(100000).setSort("ascending").getFilter();
        System.out.println("filters set are: "+filters2);

    }
}
