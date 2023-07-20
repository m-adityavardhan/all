package creational.AbstractFactoryPattern;

import creational.AbstractFactoryPattern.companys.AbstractCompanyFactory;
import creational.AbstractFactoryPattern.companys.Company;

public class Main
{
    public static void main(String[] args)
    {
        Laptop laptop2=new Laptop();
        Company company2= AbstractCompanyFactory.getCompany("microsoft");

        laptop2.attach(company2.getGpu(),company2.getOS(),company2.getProcessor());
        System.out.println("microsoft laptop created is\n");
        laptop2.boot();

        Laptop laptop1=new Laptop();
        Company company= AbstractCompanyFactory.getCompany("apple");

        laptop1.attach(company.getGpu(),company.getOS(),company.getProcessor());
        System.out.println("\napple laptop created\n");
        laptop1.boot();
    }
}
