package javabase.Fitness;

import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        FitnessClub fitnessClub = new FitnessClub();

        Customer customer1 = new Customer("Андрей", "Андреев", 2000);
        Customer customer2 = new Customer("Евгений", "Беляев", 2000);
        Customer customer3 = new Customer("Михаил", "Чернов", 2000);

        Subscription dailySubscription = new Subscription(customer1, new Date(), new Date(new Date().getTime() + 86400000)); // 8 640 000мс в дне
        Subscription fullSubscription = new Subscription(customer2, new Date(), new Date(new Date().getTime() + 648000000 * 4)); // 2 592 000 000мс в месяце, но не поместилось поэтому так

        fitnessClub.visit(customer1, dailySubscription, "бассейн");
        fitnessClub.visit(customer2, fullSubscription, "спортзал");
        fitnessClub.visit(customer3, dailySubscription, "групповые занятия");
    }
}