package javabase;

import java.util.Scanner;

public class ApartmentsPOS
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер квартиры: ");
        int apartmentNumber = input.nextInt();

        int floor = (apartmentNumber - 1) / 4 + 1;
        int position = (apartmentNumber - 1) % 4;

        String doorPosition;

        if((apartmentNumber > 36) || (apartmentNumber <= 0))
        {
            System.out.println("Такой квартиры нет");
        }

        else
        {

            if (position == 0) {
                doorPosition = "Дверь находится слева от лифта";
            } else if (position == 1) {
                doorPosition = "Дверь находится справа от лифта";
            } else if (position == 2) {
                doorPosition = "Дверь дальняя слева ";
            } else {
                doorPosition = "Дверь дальняя справа";
            }

            if (apartmentNumber <= 36) {
                System.out.println(floor + " этаж");
                System.out.println(doorPosition);
            }
        }
    }
}
