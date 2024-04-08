package javabase.FintessClub;

import java.time.LocalDate;

public class FitnessClub
{
    private Subscription[] gymSubscriptions;
    private Subscription[] swimmingPoolSubscriptions;
    private Subscription[] groupClassSubscriptions;

    public FitnessClub()
    {
        gymSubscriptions = new Subscription[20];
        swimmingPoolSubscriptions = new Subscription[20];
        groupClassSubscriptions = new Subscription[20];
    }

    public void enterFitnessZone(FitnessZone zone, Subscription subscription)
    {
        switch(zone)
        {
            case GYM:
                enterZone(gymSubscriptions, subscription);
                break;
            case SWIMMING_POOL:
                enterZone(swimmingPoolSubscriptions, subscription);
                break;
            case GROUP_EVENTS:
                enterZone(groupClassSubscriptions, subscription);
                break;
        }
    }

    private void enterZone(Subscription[] zoneSubscriptions, Subscription subscription)
    {
        if (subscription.getDateOfExpire().isBefore(LocalDate.now()))
        {
            System.out.println("Вход запрещен. Абонемент просрочен.");
            return;
        }

        if (subscription.getDateOfExpire().isBefore(LocalDate.now()) ||
                !isAllowedForZone(subscription, zoneSubscriptions))
        {
            System.out.println("Вход запрещен. Абонемент не соответствует зоне.");
            return;
        }

        for (int i = 0; i < zoneSubscriptions.length; i++)
        {
            if (zoneSubscriptions[i] == null)
            {
                zoneSubscriptions[i] = subscription;
                System.out.println("Посетитель вошел в зону");
                return;
            }
        }

        System.out.println("Вход запрещен. Не осталось свободных мест.");
    }
    // Проверяет разрешено ли использование абонемента для доступа к зоне, основываясь допущенных к зоне массивах абонементов.
    private boolean isAllowedForZone(Subscription subscription, Subscription[] zoneSubscriptions)
    {
        for (Subscription m : zoneSubscriptions)
        {
            if (m != null && m.equals(subscription))
            {
                return false;
            }
        }
        return true;
    }

    public void printCustomersInFitnessZones()
    {
        System.out.println("    Посетители зала:");
        printSubscriptions(gymSubscriptions);

        System.out.println("\n  Посетители бассейна:");
        printSubscriptions(swimmingPoolSubscriptions);

        System.out.println("\n  Посетители групповых занятий:");
        printSubscriptions(groupClassSubscriptions);
    }

    public void printSubscriptions(Subscription[] subscriptions)
    {
        for (Subscription subscription : subscriptions)
        {
            if (subscription != null)
            {
                Customer customer = subscription.getCustomer();
                System.out.println("Уникальный идентификатор: " + customer.getCustomerId() + ", " + customer.getCustomerName() + " " + customer.getCustomerSurname());
            }
        }
    }
}