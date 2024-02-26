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
        System.out.println("[3] Зарегzстрировать альпиниста");
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
                System.out.println("\nИмя: " + alpinist1.getName() + ". Возраст: " + alpinist1.getAge() + ". Адрес проживания: " + alpinist1.getAddress());
                System.out.println("Имя: " + alpinist2.getName() + ". Возраст: " + alpinist2.getAge() + ". Адрес проживания: " + alpinist2.getAddress());
                System.out.println("Имя: " + alpinist3.getName() + ". Возраст: " + alpinist3.getAge() + ". Адрес проживания: " + alpinist3.getAddress());
                System.out.println("Имя: " + alpinist4.getName() + ". Возраст: " + alpinist4.getAge() + ". Адрес проживания: " + alpinist4.getAddress());
                System.out.println("Имя: " + alpinist5.getName() + ". Возраст: " + alpinist5.getAge() + ". Адрес проживания: " + alpinist5.getAddress());
                System.out.println("Имя: " + alpinist6.getName() + ". Возраст: " + alpinist6.getAge() + ". Адрес проживания: " + alpinist6.getAddress());
                System.out.println("Имя: " + alpinist7.getName() + ". Возраст: " + alpinist7.getAge() + ". Адрес проживания: " + alpinist7.getAddress());
                System.out.println("Имя: " + alpinist8.getName() + ". Возраст: " + alpinist8.getAge() + ". Адрес проживания: " + alpinist8.getAddress());
                System.out.println("Имя: " + alpinist9.getName() + ". Возраст: " + alpinist9.getAge() + ". Адрес проживания: " + alpinist9.getAddress());
                mainMenu(elbrus, jin, everest);
                break;

            case 3:
                System.out.print("Введите имя альпиниста: ");
                String tempName = input.next();
                alpinist4.setName(tempName);

                System.out.print("Введите возраст альпиниста: ");
                int tempAge = input.nextInt();
                alpinist4.setAge(tempAge);

                System.out.print("Введите адрес альпиниста: ");
                String tempAddress = input.next();
                alpinist4.setAddress(tempAddress);

                mainMenu(elbrus, jin, everest);
                break;

            default:
                System.out.println("Выход за пределы диапазона.");
                mainMenu(elbrus, jin, everest);
                break;
        }
    }
}
