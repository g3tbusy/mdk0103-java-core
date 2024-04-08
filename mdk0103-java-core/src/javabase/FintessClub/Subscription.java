package javabase.FintessClub;

import java.time.LocalDate;

public class Subscription
{
    private LocalDate dateOfRegistration;
    private LocalDate dateOfExpire;
    private Customer customer;

    public Subscription(Customer customer, LocalDate dateOfRegistration, LocalDate dateOfExpire)
    {
        this.customer = customer;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfExpire = dateOfExpire;
    }

    public LocalDate getDateOfRegistration()
    {
        return dateOfRegistration;
    }

    public LocalDate getDateOfExpire()
    {
        return dateOfExpire;
    }

    public Customer getCustomer()
    {
        return customer;
    }
}