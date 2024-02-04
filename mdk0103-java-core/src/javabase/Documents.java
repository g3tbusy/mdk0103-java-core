package javabase;

public class Documents
{
    public static void main(String[] args)
    {
        String[] docs = {"паспорт", "водительское удостоверение", "свидетельство о рождении"};
        String[] clients = {"Тайлерджан", "Тимур", "Борис"};

        if (docs.length == clients.length)
        {
            System.out.println(clients[0] + " предоставил " + docs[0]);
            System.out.println(clients[1] + " предоставил " + docs[1]);
            System.out.println(clients[2] + " предоставил " + docs[2]);
        }

        else
        {
            System.out.println("Загружено неверное количество документов или клиентов.");
        }
    }
}
