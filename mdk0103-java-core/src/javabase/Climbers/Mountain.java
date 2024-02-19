package javabase.Climbers;

import java.util.Scanner;

public class Mountain
{
    protected String name;
    protected String country;
    protected double weight;

    public Mountain(String name, String country, double weight)
    {
        this.name = name;
        this.country = country;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public String getCountry()
    {
        return country;
    }

    public double getWeight()
    {
        return weight;
    }

    public static Scanner input = new Scanner(System.in);
    public static Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642);
    public static Mountain jin = new Mountain("Цзинь", "Япония", 0.6);
    public static Mountain everest = new Mountain("Эверест","Граница Непала и китайского тибета", 8848);

}
