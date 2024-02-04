package javabase;

import java.util.Scanner;

public class Invest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int years;
        int temp;

        System.out.print("Сколько вкладываем? ");
        int balance = input.nextInt();

        for (years = 0; balance <= 1000000; years++)
        {
            temp = 0;
            System.out.println("Спустя " + years + "й год сумма на вкладе: " + balance);
            temp = (balance / 100) * 10;
            balance = balance + temp;
        }

        System.out.println("миллионер через " + years + " лет.");
    }
}
