package javabase;

import java.util.Scanner;

public class Wallet
{
    public static void main()
    {
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.print("В какую страну отправляемся?\n[1] Швеция\n[2] Китай\nВыбор: ");
        choice = input.nextInt();

        switch(choice)
        {
            case 1:

                break;

            case 2:

                break;

            default:
                main();
        }

    }
}
