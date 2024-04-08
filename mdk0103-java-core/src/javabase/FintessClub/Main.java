package javabase.FintessClub;

import java.time.LocalDate;

import static javabase.FintessClub.Customer.*;

public class Main
{
    public static void main(String[] args)
    {
        FitnessClub fitnessClub = new FitnessClub();

        addCustomersToZone(fitnessClub, FitnessZone.GYM);
        addCustomersToZone(fitnessClub, FitnessZone.SWIMMING_POOL);
        addCustomersToZone(fitnessClub, FitnessZone.GROUP_EVENTS);

        fitnessClub.printCustomersInFitnessZones();
    }

    static Subscription createSubscription(String customerName, String customerSurname, int customerId)
    {
        Customer customer = new Customer(customerName, customerSurname, customerId);
        LocalDate registrationDate = LocalDate.now();
        LocalDate expiryDate = registrationDate.plusMonths(1); //  абонемент на месяц
        return new Subscription(customer, registrationDate, expiryDate);
    }
}