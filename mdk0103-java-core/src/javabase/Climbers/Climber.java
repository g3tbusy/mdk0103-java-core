package javabase.Climbers;

public class Climber
{
    protected String name;
    protected int age;
    protected String address;

    public Climber(String name, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
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
}
