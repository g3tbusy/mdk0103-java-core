package javabase.Alpinist;

public class Mountain
{
    private static String name;
    private String country;
    private double weight;

    public Mountain(String name, String country, double weight)
    {
        this.name = name;
        this.country = country;
        this.weight = weight;
    }

    public static String getName()
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

    public static Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642);
    public static Mountain jin = new Mountain("Цзинь", "Япония", 0.6);
    public static Mountain everest = new Mountain("Эверест","Граница Непала и китайского тибета", 8848);

}
