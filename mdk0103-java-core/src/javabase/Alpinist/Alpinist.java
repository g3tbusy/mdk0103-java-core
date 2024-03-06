package javabase.Alpinist;

public class Alpinist
{
    private int group;
    private String name;
    private int age;
    private String address;

    public Alpinist(int group, String name, int age, String address)
    {
        this.group = group;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getGroup()
    {
        return group;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) // for donate $$$
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public static Alpinist alpinist1 = new Alpinist(1,"Виталий", 27, "Любань");
    public static Alpinist alpinist2 = new Alpinist(1,"Михаил", 23, "Boston");
    public static Alpinist alpinist3 = new Alpinist(1,"Андрей", 20, "Мишкино");

    public static Alpinist alpinist4 = new Alpinist(2,"NULL", 0, "NULL");
    public static Alpinist alpinist5 = new Alpinist(2,"NULL", 0, "NULL");
    public static Alpinist alpinist6 = new Alpinist(2,"NULL", 0, "NULL");

    public static Alpinist alpinist7 = new Alpinist(3,"NULL", 0, "NULL");
    public static Alpinist alpinist8 = new Alpinist(3,"NULL", 0, "NULL");
    public static Alpinist alpinist9 = new Alpinist(3,"NULL", 0, "NULL");

}123
