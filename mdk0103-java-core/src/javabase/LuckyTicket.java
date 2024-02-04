package javabase;

import java.util.Scanner;

public class LuckyTicket
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите номер билета: №");
        int ticket = input.nextInt();
        int forResultMessage = ticket;

        int[] ticketNums = new int[6];

        for (int i = ticketNums.length - 1; i >= 0; i--)
        {
            ticketNums[i] = ticket % 10;
            ticket /= 10;
        }

        int sumFirst = ticketNums[0] + ticketNums[1] + ticketNums[2];
        int sumLast = ticketNums[3] + ticketNums[4] + ticketNums[5];

        if (sumFirst == sumLast && sumFirst % 2 == 0)
        {
            System.out.println("Ваш билет №" + forResultMessage + " - счастливый.");
        }
        else
        {
            System.out.println("Ваш билет №" + forResultMessage + " - несчастливый.");
        }
    }
}
