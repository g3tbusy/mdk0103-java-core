package javabase.Fitness;

import java.util.Date;

public class Subscription
{
    private Customer owner;
    private Date registration;
    private Date expiration;

    public Subscription(Customer owner, Date registration, Date expiration)
    {
        this.owner = owner;
        this.registration = registration;
        this.expiration = expiration;
    }
}