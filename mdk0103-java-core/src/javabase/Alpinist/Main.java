package javabase.Alpinist;

import java.util.Scanner;

import static javabase.Alpinist.Alpinist.*;
import static javabase.Alpinist.CreateAlpinist.*;
import static javabase.Alpinist.Mountain.*;

public class Main
{
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        mainMenu(elbrus, jin, everest);
    }

    public static void mainMenu(Mountain elbrus, Mountain jin, Mountain everest)
    {
        System.out.println("\n---Главное меню---");
        System.out.println("[1] Просмотреть доступные горы");
        System.out.println("[2] Просмотреть список альпинистов");
        System.out.println("[3] Зарегистрировать альпиниста");
        System.out.println("[4] Просмотреть группы");
        System.out.print("Выбор: ");

        int choice = input.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("\nНазвание: " + elbrus.getName() + ". Страна: " + elbrus.getCountry() + ". Высота: " + elbrus.getWeight() + "м");
                System.out.println("Название: " + jin.getName() + ". Страна: " + jin.getCountry() + ". Высота: " + jin.getWeight() + "м");
                System.out.println("Название: " + everest.getName() + ". Страна: " + everest.getCountry() + ". Высота: " + everest.getWeight() + "м");
                mainMenu(elbrus, jin, everest);
                break;

            case 2:
                System.out.println("\nГруппа: " + alpinist1.getGroup() + ". Имя: " + alpinist1.getName() + ". Возраст: " + alpinist1.getAge() + ". Адрес проживания: " + alpinist1.getAddress());
                System.out.println("Группа: " + alpinist2.getGroup() + ". Имя: " + alpinist2.getName() + ". Возраст: " + alpinist2.getAge() + ". Адрес проживания: " + alpinist2.getAddress());
                System.out.println("Группа: " + alpinist3.getGroup() + ". Имя: " + alpinist3.getName() + ". Возраст: " + alpinist3.getAge() + ". Адрес проживания: " + alpinist3.getAddress());
                System.out.println("\nГруппа: " + alpinist4.getGroup() + ". Имя: " + alpinist4.getName() + ". Возраст: " + alpinist4.getAge() + ". Адрес проживания: " + alpinist4.getAddress());
                System.out.println("Группа: " + alpinist5.getGroup() + ". Имя: " + alpinist5.getName() + ". Возраст: " + alpinist5.getAge() + ". Адрес проживания: " + alpinist5.getAddress());
                System.out.println("Группа: " + alpinist6.getGroup() + ". Имя: " + alpinist6.getName() + ". Возраст: " + alpinist6.getAge() + ". Адрес проживания: " + alpinist6.getAddress());
                System.out.println("\nГруппа: " + alpinist7.getGroup() + ". Имя: " + alpinist7.getName() + ". Возраст: " + alpinist7.getAge() + ". Адрес проживания: " + alpinist7.getAddress());
                System.out.println("Группа: " + alpinist8.getGroup() + ". Имя: " + alpinist8.getName() + ". Возраст: " + alpinist8.getAge() + ". Адрес проживания: " + alpinist8.getAddress());
                System.out.println("Группа: " + alpinist9.getGroup() + ". Имя: " + alpinist9.getName() + ". Возраст: " + alpinist9.getAge() + ". Адрес проживания: " + alpinist9.getAddress());
                mainMenu(elbrus, jin, everest);
                break;

            case 3:
                addAlpinist();
                break;

            case 4:

                break;

            default:
                System.out.println("Выход за пределы диапазона.");
                mainMenu(elbrus, jin, everest);
                break;
        }
    }
}
