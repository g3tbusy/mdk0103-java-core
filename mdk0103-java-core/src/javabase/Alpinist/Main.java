package javabase.Alpinist;

import static javabase.Alpinist.Mountain.*;
import static javabase.Alpinist.Group.*;

public class Main
{
    public static void main(String[] args)
    {
        mainMenu(elbrus, jin, everest);
    }

    private static void addAlpinist()
    {

    }

    private static void mainMenu(Mountain elbrus, Mountain jin, Mountain everest)
    {
        System.out.println("\n---Главное меню---");
        System.out.println("[1] Просмотреть доступные горы");
        System.out.println("[2] Просмотреть список альпинистов");
        System.out.println("[3] Зарегестрировать альпиниста");
        System.out.print("Выбор: ");

        int choice = input.nextInt();

        switch(choice)
        {
            default:
                System.out.println("Выход за пределы диапазона.");
                mainMenu(elbrus, jin, everest);

            case 1:
                System.out.println("\nНазвание: " + elbrus.getName() + ". Страна: " + elbrus.getCountry() + ". Высота: " + elbrus.getWeight() + "м");
                System.out.println("Название: " + jin.getName() + ". Страна: " + jin.getCountry() + ". Высота: " + jin.getWeight() + "м");
                System.out.println("Название: " + everest.getName() + ". Страна: " + everest.getCountry() + ". Высота: " + everest.getWeight() + "м");
                mainMenu(elbrus, jin, everest);

            case 2:
                System.out.println("");

            case 3:
                addAlpinist(Alpinist alpinist);
        }
    }
}
