package javabase;

public class ArrayEvenNums
{
    public static void main(String[] args)
    {
        int[] array= new int[10];
        int temp = 0;

        for (int i = 0; i < array.length; i++)
        {
            temp += 2;
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}