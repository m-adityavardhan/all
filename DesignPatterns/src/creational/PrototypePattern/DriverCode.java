package creational.PrototypePattern;


public class DriverCode
{
    public static void main(String[] args)
    {

        Car audi=new AudiCar();
        audi.addEngine();
        audi.addRoof();
        audi.addTyres();
        System.out.println("car 1 is "+audi+"\n");


        Car bmw=new BmwCar();
        bmw.addEngine();
        bmw.addRoof();
        bmw.addTyres();
        System.out.println("car 2 is "+bmw+"\n");

        CarRegistry shop=new CarRegistry();
        shop.addCar("Audi",audi);
        shop.addCar("BMW",bmw);

        Car copy1=shop.getCar("Audi");
        Car copy2= shop.getCar("BMW");
        System.out.println("copy 1 is "+copy1);
        System.out.println("copy 2 is "+copy2);

        Car copy3= shop.getCar("BMW");
        System.out.println("copy 3 is "+copy3);





//        Document d1=new Document("java");
//        d1.addText();
//        System.out.println("document 1 contains "+d1);
//        System.out.println("copying document 1 into 2");
//        Prototype d2=d1.clone();
//        System.out.println("document 2 contains "+d2);

    }

}
