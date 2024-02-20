package javabase.Alpinist;

public class Group extends Alpinist
{
    private int currentIndex;
    private Alpinist[] Alpinist;
    private boolean isJoinOpened;

    public Group(String name, int age, String address, int groupsize)
    {
        super(name, age, address);
        this.Alpinist = new Alpinist[groupsize];
        this.isJoinOpened = false;
        this.currentIndex = 0;
    }

    // метод для добавления альпиниста в группу
    public void addAlpinist(Alpinist alpinist)
    {
        if (isJoinOpened && currentIndex < Alpinist.length)
        {
            Alpinist[currentIndex++] = alpinist;  // добавляем альпиниста в массив и увеличиваем текущий индекс
            System.out.println(alpinist.getName() + " добавлен в группу для восхождения на " + Mountain.getName());
        }
        else if (!isJoinOpened)
        {
            System.out.println("Набор в группу на восхождение на " + Mountain.getName() + " не открыт");
        }
        else
        {
            System.out.println("Группа полная для восхождения на " + Mountain.getName());
        }
    }

    // метод показывает сколько альпинистов пойдут на гору
    public void printAlpinists()
    {
        System.out.println("Альпинисты в группе для восхождения на " + Mountain.getName() + ":");
        for (Alpinist alpinist : Alpinist)
        {
            if (alpinist != null)
            {
                System.out.println(alpinist.getName());
            }
        }
    }

}
