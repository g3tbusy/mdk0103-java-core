package javabase.Alpinist;

import static javabase.Alpinist.Alpinist.*;
import static javabase.Alpinist.Main.*;

public class CreateAlpinist
{
    private static String tempName;
    private static int tempAge;
    private static String tempAddress;

    static void addAlpinist()
    {
        System.out.print("Выберите альпиниста 1 - 9");
        int choice = input.nextInt();

        switch(choice)
        {
            case 1:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist1.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist1.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist1.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 2:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist2.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist2.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist2.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 3:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist3.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist3.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist3.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 4:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist4.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist4.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist4.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 5:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist5.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist5.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist5.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 6:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist6.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist6.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist6.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 7:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist7.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist7.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist7.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 8:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist8.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist8.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist8.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            case 9:
                System.out.print("Введите имя альпиниста: ");
                tempName = input.next();
                alpinist9.setName(tempName);
                tempName = "NULL";

                System.out.print("Введите возраст альпиниста: ");
                tempAge = input.nextInt();
                alpinist9.setAge(tempAge);
                tempAge = 0;

                System.out.print("Введите адрес альпиниста: ");
                tempAddress = input.next();
                alpinist9.setAddress(tempAddress);
                tempAddress = "NULL";
                break;

            default:
                addAlpinist();
                break;

            mainmenu();
        }
    }
}
