package javabase.Fitness;

public class FitnessZone
{
    private Subscription[] subscriptions = new Subscription[20];
    private int count = 0;
    private String name;

    public FitnessZone(String name)
    {
        this.name = name;
    }

    public void registerSubscription(Subscription subscription)
    {
        if (count < 20)
        {
            subscriptions[count++] = subscription;
            System.out.println("Абонемент зарегистрирован в " + name);
        }
        else
        {
            System.out.println("Достигнуто максимальное количество абонементов в " + name);
        }
    }
}