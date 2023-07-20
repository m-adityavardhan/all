package creational.BuilderPattern;

import javax.annotation.processing.Filer;

public class Filters
{
    private int pageno;
    private String sort;
    private String brand;
    private int price;

    private Filters(int page)
    {
        pageno=page;
    }

    public Filters(FilterBuilder filterBuilder)
    {
        this.pageno= filterBuilder.pageno;
        this.price=filterBuilder.price;
        this.brand= filterBuilder.brand;
        this.sort= filterBuilder.sort;
    }

    @Override
    public String toString() {
        return  "\n pageno=" + pageno +
                "\n sort='" + sort + '\'' +
                "\n brand='" + brand + '\'' +
                "\n price=" + price ;
    }

    static class FilterBuilder
    {
        private int pageno;
        private String sort;
        private String brand;
        private int price;

        public FilterBuilder(int page)
        {
            pageno=page;
        }

        public FilterBuilder setSort(String sort)
        {
            System.out.println("setting sort option to "+sort);
            this.sort=sort;
            return this;
        }

        public FilterBuilder setBrand(String brand)
        {
            System.out.println("setting brand to "+brand);
            this.brand=brand;
            return this;
        }

        public FilterBuilder setPrice(int price)
        {
            System.out.println("setting price option to below "+price+" rupees");
            this.price=price;
            return this;
        }

        public Filters getFilter()
        {
            return new Filters(this);
        }
    }
}
