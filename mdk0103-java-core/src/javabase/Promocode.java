package javabase;

import java.util.Scanner;

public class Promocode
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Суммма покупки: ");
        int total = input.nextInt();
        System.out.print("Введите промокод: ");
        int promo = input.nextInt();

        switch(promo)
        {
            case 4525:
            {
                total = total - ((total / 100) * 30);
                System.out.println("Сумма покупки с промокодом на скидку в 30%: " + total);
                break;
            }

            case 6424:
            case 7012:
            {
                total = total - ((total / 100) * 20);
                System.out.println("Сумма покупки с промокодом на скидку в 20%: " + total);
                break;
            }

            case 7647:
            case 9011:
            case 6612:
            {
                total = total - ((total / 100) * 10);
                System.out.println("Сумма покупки с промокодом на скидку в 10%: " + total);
                break;
            }

            default:
            {
                System.out.println("Промокод не найден.");
            }
        }
    }
}
