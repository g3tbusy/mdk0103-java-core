package javabase.Alpinist;

import static javabase.Alpinist.Alpinist.*;
import static javabase.Alpinist.Main.*;
import static javabase.Alpinist.Mountain.*;
import static javabase.Alpinist.groupJoinCheck.*;

public class CreateAlpinist
{
    private static String tempName;
    private static int tempAge;
    private static String tempAddress;

    static void addAlpinist()
    {
        System.out.print("\nВыберите группу [1 - 3]: ");
        int choice = input.nextInt();

        if(choice == 1 && (!isJoinOpened1))
        {
            System.out.println("Набор в 1 группу закрыт.");
            addAlpinist();
        }
        else if(choice == 2 && (!isJoinOpened2))
        {
            System.out.println("Набор в 2 группу закрыт.");
            addAlpinist();
        }
        else if(choice == 3 && (!isJoinOpened3))
        {
            System.out.println("Набор в 3 группу закрыт.");
            addAlpinist();
        }

        switch(choice)
        {
            case 2:
                System.out.print("\nВыберите альпиниста [4 - 6]: ");
                int choiceAlpinist = input.nextInt();
                    switch(choiceAlpinist)
                    {
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
                    }
                break;

            case 3:
                System.out.print("\nВыберите альпиниста [7 - 9]: ");
                choiceAlpinist = input.nextInt();
                switch(choiceAlpinist)
                {
                    case 4:
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

                    case 5:
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

                    case 6:
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
                }
                break;

            default:
                addAlpinist();
                break;
        }

        Main.mainMenu(elbrus, jin, everest);
    }
}123
