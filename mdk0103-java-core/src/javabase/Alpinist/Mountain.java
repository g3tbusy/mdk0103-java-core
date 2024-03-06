package javabase.Alpinist;

public class Mountain
{
    private static String name;
    private String country;
    private double weight;
    private final int group;

    public Mountain(String name, String country, double weight, int group)
    {
        Mountain.name = name;
        this.country = country;
        this.weight = weight;
        this.group = group;
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

    public int getGroup()
    {
        return group;
    }

    public static Mountain elbrus = new Mountain("Эльбрус", "Россия", 5642, 1);
    public static Mountain jin = new Mountain("Цзинь", "Япония", 0.6, 2);
    public static Mountain everest = new Mountain("Эверест","Граница Непала и китайского тибета", 8848, 3);

}
