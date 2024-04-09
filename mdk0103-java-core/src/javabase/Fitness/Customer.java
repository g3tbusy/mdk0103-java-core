package javabase.Fitness;

public class Customer
{
    private String Name;
    private String surName;
    private int birthYear;

    public Customer(String Name, String surName, int birthYear)
    {
        this.Name = Name ;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    public String getName()
    {
        return Name;
    }

    public String getSurName()
    {
        return surName;
    }

    public int getBirthYear()
    {
        return birthYear;
    }
}