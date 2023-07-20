package creational.PrototypePattern;

public class AudiCar implements Car
{
    private String tyres;
    private String engine;
    private String roof;

    public AudiCar(){}
    public AudiCar(String tyres, String engine, String roof)
    {
        this.tyres = tyres;
        this.engine = engine;
        this.roof = roof;
    }
    public AudiCar(AudiCar car)
    {
        this.tyres = car.tyres;
        this.engine = car.engine;
        this.roof = car.roof;
    }

    @Override
    public void addTyres()
    {
        System.out.println("Adding tyres");
        tyres="appollo ";
    }

    @Override
    public void addEngine()
    {
        System.out.println("Adding  engine");
        engine="V8";
    }

    @Override
    public void addRoof()
    {
        System.out.println("Adding roof");
        roof="detachable roof";
    }

    @Override
    public Car clone()
    {
        return new AudiCar(this);
    }

    @Override
    public String toString() {
        return "AudiCar{" +
                "tyres='" + tyres + '\'' +
                ", engine='" + engine + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
