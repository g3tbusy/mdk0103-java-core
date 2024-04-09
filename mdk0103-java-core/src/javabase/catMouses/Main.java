package javabase.catMouses;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat("Main cat", 20, 7);
        Mouse mouse1 = new Mouse(15);
        Mouse mouse2 = new Mouse(16);
        //Mouse mouse3 = new Mouse(21);

        CheckCatchMouse(cat1, mouse1);
        CheckCatchMouse(cat1, mouse2);
       // CheckCatchMouse(cat1, mouse3);
    }

    public static void CheckCatchMouse(Cat cat, Mouse mouse)
    {
        if (cat.speed > Mouse.speed)
        {
            cat.mouseCatching(mouse);
            System.out.println("Мышей поймано: " + cat.mousesQuantity());
        }
        else
        {
            System.out.println("Не удалось поймать мышь");
        }
    }
}