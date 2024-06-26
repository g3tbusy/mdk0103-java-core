package javabase.Fitness;

public class FitnessClub
{
    private FitnessZone gym = new FitnessZone("зал");
    private FitnessZone pool = new FitnessZone("бассейн");
    private FitnessZone group = new FitnessZone("групповые занятия");

    public boolean checkAccess(Subscription subscription, String zone)
    {
        return true;
    }

    public void visit(Customer customer, Subscription subscription, String zone)
    {
        FitnessZone selectedZone = null;

        switch (zone)
        {
            case "спортзал":
                selectedZone = gym;
                break;
            case "бассейн":
                selectedZone = pool;
                break;
            case "групповые занятия":
                selectedZone = group;
                break;
        }

        if (selectedZone != null)
        {
            if (checkAccess(subscription, zone))
            {
                selectedZone.registerSubscription(subscription);
                System.out.println(customer.getName() + " " + customer.getSurName() + " посещает " + zone);
            }

            else

            {
                System.out.println("Вход запрещен для " + customer.getName() + " " + customer.getSurName());
            }
        }

        else

        {
            System.out.println("Неверно указана зона");
        }
    }
}