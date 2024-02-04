package javabase;

import java.util.Scanner;

public class Dishes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество тарелок");
        int dishes = input.nextInt();

        System.out.println("Введите количество моющего средства");
        double detergent = input.nextDouble();

        do
        {
            System.out.println("Осталось " + dishes + " тарелок " + "и " + detergent + " средства");
            detergent = detergent - 0.5;
            dishes = dishes - 1;
        }
        while (detergent >= 0);

        if(dishes > 0)
        {
            System.out.println("Средства не хватило.");
        }
    }
}
