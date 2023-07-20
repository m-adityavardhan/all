package creational.PrototypePattern;

public class BmwCar implements Car
{
    private String tyres;
    private String engine;
    private String roof;

    public BmwCar(){}
    public BmwCar(String tyres, String engine, String roof)
    {
        this.tyres = tyres;
        this.engine = engine;
        this.roof = roof;
    }
    public BmwCar(BmwCar car)
    {
        this.tyres = car.tyres;
        this.engine = car.engine;
        this.roof = car.roof;
    }

    @Override
    public void addTyres()
    {
        System.out.println("Adding  tyres");
        tyres="Ciat";
    }

    @Override
    public void addEngine()
    {
        System.out.println("Adding engine");
        engine="V12";
    }

    @Override
    public void addRoof()
    {
        System.out.println("Adding  roof");
        roof="black";
    }

    @Override
    public Car clone()
    {
        return new BmwCar(this);
    }

    @Override
    public String toString() {
        return "BmwCar{" +
                "tyres='" + tyres + '\'' +
                ", engine='" + engine + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
