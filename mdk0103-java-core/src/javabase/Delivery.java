package javabase;

public class Delivery
{
    public static void main(String[] args)
    {
        int[][] house = new int [10][5];

        for(int i = 0; i < house.length; i++)
        {
            for(int j = 0; j < house[i].length; j++)
            {
                house[i][j] = j + 1 + (i * house[i].length);
                System.out.println(i + 1 + " этаж " + (j + 1 + (i * house[i].length) + " квартира." + " Заказ доставлен"));
            }
        }
    }
}
