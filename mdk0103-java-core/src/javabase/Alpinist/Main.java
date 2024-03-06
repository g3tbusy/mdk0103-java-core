package javabase.Alpinist;

import java.util.Scanner;

import static javabase.Alpinist.Alpinist.*;
import static javabase.Alpinist.CreateAlpinist.*;
import static javabase.Alpinist.Mountain.*;
import static javabase.Alpinist.groupJoinCheck.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static boolean isJoinOpened;


    public static void main(String[] args)
    {
        mainMenu(elbrus, jin, everest);
    }

    public static void mainMenu(Mountain elbrus, Mountain jin, Mountain everest)
    {
        System.out.print("\n---Главное меню---\n" +
                "[1] Просмотреть доступные горы\n" +
                "[2] Просмотреть список альпинистов\n" +
                "[3] Зарегистрировать альпиниста в группу\n" +
                "Выбор: ");

        int choice = input.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("\nНазвание: " + elbrus.getName() + ". Страна: " + elbrus.getCountry() + ". Высота: " + elbrus.getWeight() + "м. " + "Группа восхождения: " + elbrus.getGroup() +
                        "\nНазвание: " + jin.getName() + ". Страна: " + jin.getCountry() + ". Высота: " + jin.getWeight() + "м. " + "Группа восхождения: " + jin.getGroup() +
                        "\nНазвание: " + everest.getName() + ". Страна: " + everest.getCountry() + ". Высота: " + everest.getWeight() + "м. " + "Группа восхождения: " + everest.getGroup());
                mainMenu(elbrus, jin, everest);
                break;

            case 2:
                isJoinOpened();
                System.out.println("\n      Группа 1. Открыт ли набор: " + isJoinOpened1);

                System.out.println("Имя: " + alpinist1.getName() + ". Возраст: " + alpinist1.getAge() + ". Адрес проживания: " + alpinist1.getAddress() +
                        "\nИмя: " + alpinist2.getName() + ". Возраст: " + alpinist2.getAge() + ". Адрес проживания: " + alpinist2.getAddress() +
                        "\nИмя: " + alpinist3.getName() + ". Возраст: " + alpinist3.getAge() + ". Адрес проживания: " + alpinist3.getAddress());

                System.out.println("\n      Группа 2. Открыт ли набор: " + isJoinOpened2);

                System.out.println("Имя: " + alpinist4.getName() + ". Возраст: " + alpinist4.getAge() + ". Адрес проживания: " + alpinist4.getAddress() +
                        "\nИмя: " + alpinist5.getName() + ". Возраст: " + alpinist5.getAge() + ". Адрес проживания: " + alpinist5.getAddress() +
                        "\nИмя: " + alpinist6.getName() + ". Возраст: " + alpinist6.getAge() + ". Адрес проживания: " + alpinist6.getAddress());

                System.out.println("\n      Группа 3. Открыт ли набор: " + isJoinOpened3);

                System.out.println("Имя: " + alpinist7.getName() + ". Возраст: " + alpinist7.getAge() + ". Адрес проживания: " + alpinist7.getAddress() +
                        "\nИмя: " + alpinist8.getName() + ". Возраст: " + alpinist8.getAge() + ". Адрес проживания: " + alpinist8.getAddress() +
                        "\nИмя: " + alpinist9.getName() + ". Возраст: " + alpinist9.getAge() + ". Адрес проживания: " + alpinist9.getAddress());
                mainMenu(elbrus, jin, everest);
                break;

            case 3:
                isJoinOpened();
                addAlpinist();
                break;

            default:
                System.out.println("Выход за пределы диапазона.");

                mainMenu(elbrus, jin, everest);
                break;
        }
    }123
}
