package javabase.FintessClub;

import static javabase.FintessClub.Main.*;

public class Customer
{
    private String customerName;
    private String customerSurname;
    private int customerId;

    public Customer(String customerName, String customerSurname, int customerId)
    {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerId = customerId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerSurname()
    {
        return customerSurname;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    static void addCustomersToZone(FitnessClub fitnessClub, FitnessZone zone)
    {
        fitnessClub.enterFitnessZone(zone, createSubscription("Alice", "Smith", 1));
        fitnessClub.enterFitnessZone(zone, createSubscription("Bob", "Johnson", 2));
        fitnessClub.enterFitnessZone(zone, createSubscription("Matthew", "Williams", 3));
        fitnessClub.enterFitnessZone(zone, createSubscription("David", "Brown", 4));
        fitnessClub.enterFitnessZone(zone, createSubscription("Emma", "Jones", 5));
        fitnessClub.enterFitnessZone(zone, createSubscription("Frank", "Miller", 6));
        fitnessClub.enterFitnessZone(zone, createSubscription("Grace", "Davis", 7));
        fitnessClub.enterFitnessZone(zone, createSubscription("Henry", "Taylor", 8));
        fitnessClub.enterFitnessZone(zone, createSubscription("Isabella", "Anderson", 9));
        fitnessClub.enterFitnessZone(zone, createSubscription("Jack", "Thomas", 10));
        fitnessClub.enterFitnessZone(zone, createSubscription("Katherine", "Clark", 11));
        fitnessClub.enterFitnessZone(zone, createSubscription("Liam", "Wilson", 12));
        fitnessClub.enterFitnessZone(zone, createSubscription("Mia", "Moore", 13));
        fitnessClub.enterFitnessZone(zone, createSubscription("Noah", "White", 14));
        fitnessClub.enterFitnessZone(zone, createSubscription("Olivia", "Hall", 15));
        fitnessClub.enterFitnessZone(zone, createSubscription("Peter", "Adams", 16));
        fitnessClub.enterFitnessZone(zone, createSubscription("Quinn", "Mitchell", 17));
        fitnessClub.enterFitnessZone(zone, createSubscription("Rachel", "Nelson", 18));
        fitnessClub.enterFitnessZone(zone, createSubscription("Samuel", "Hill", 19));
        fitnessClub.enterFitnessZone(zone, createSubscription("Tara", "Carter", 20));
        fitnessClub.enterFitnessZone(zone, createSubscription("Ulysses", "Russell", 21));
        fitnessClub.enterFitnessZone(zone, createSubscription("Victoria", "Edwards", 22));
        fitnessClub.enterFitnessZone(zone, createSubscription("William", "Garcia", 23));
        fitnessClub.enterFitnessZone(zone, createSubscription("Xavier", "Rodriguez", 24));
        fitnessClub.enterFitnessZone(zone, createSubscription("Yvonne", "Lopez", 25));
        fitnessClub.enterFitnessZone(zone, createSubscription("Zachary", "Martinez", 26));
        fitnessClub.enterFitnessZone(zone, createSubscription("Sophia", "Gonzalez", 27));
        fitnessClub.enterFitnessZone(zone, createSubscription("Ethan", "Perez", 28));
        fitnessClub.enterFitnessZone(zone, createSubscription("Ava", "Sanchez", 29));
        fitnessClub.enterFitnessZone(zone, createSubscription("Michael", "Young", 30));
        fitnessClub.enterFitnessZone(zone, createSubscription("Emily", "Rivera", 31));
        fitnessClub.enterFitnessZone(zone, createSubscription("James", "Evans", 32));
        fitnessClub.enterFitnessZone(zone, createSubscription("Avery", "Cook", 33));
        fitnessClub.enterFitnessZone(zone, createSubscription("Natalie", "Murphy", 34));
        fitnessClub.enterFitnessZone(zone, createSubscription("Daniel", "Harris", 35));
        fitnessClub.enterFitnessZone(zone, createSubscription("Madison", "Washington", 36));
        fitnessClub.enterFitnessZone(zone, createSubscription("Logan", "King", 37));
        fitnessClub.enterFitnessZone(zone, createSubscription("Grace", "Lee", 38));
        fitnessClub.enterFitnessZone(zone, createSubscription("Benjamin", "Scott", 39));
        fitnessClub.enterFitnessZone(zone, createSubscription("Chloe", "Green", 40));
    }
}