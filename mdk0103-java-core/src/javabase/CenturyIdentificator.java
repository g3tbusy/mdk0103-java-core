package javabase;

import java.util.Scanner;

public class CenturyIdentificator
{
    public static void main(String[] args)
    {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите год: ");
        year = input.nextInt();

        int century = year / 100;

        System.out.println(century + 1 + "й век.");
    }
}
