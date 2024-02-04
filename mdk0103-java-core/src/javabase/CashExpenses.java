package javabase;

import java.util.Random;

public class CashExpenses
{
    public static void main(String[] args)
    {
        int[] array = new int[7];
        int totalExpenses = 0;

        Random randArr = new Random();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = randArr.nextInt(1001);
        }

        System.out.println("Траты за неделю:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("День " + (i + 1) + ": " + array[i] + "₽");
        }

        for (int i = 0; i < array.length; i++)
        {
            totalExpenses = totalExpenses + array[i];
        }

        System.out.println("Общая сумма трат за неделю: " + totalExpenses + "₽");
    }
}
