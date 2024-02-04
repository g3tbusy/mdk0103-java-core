package javabase;

public class ArrayMinMaxAvg
{
    public static void main(String[] args)
    {
        int[] array = new int[50];

        System.out.print("[ ");

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 50) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.print("]");

        System.out.println();

        int max = findMax(array);
        int min = findMin(array);
        double average = findAverage(array);

        System.out.println("максимальный элемент: " + max);
        System.out.println("минимальный элемент: " + min);
        System.out.println("среднее арифметическое: " + average);
    }

    private static int findMax(int[] array)
    {
        int max = array[0];
        for (int num : array)
        {
            if (num > max)
            {
                max = num;
            }
        }
        return max;
    }

    private static int findMin(int[] array)
    {
        int min = array[0];
        for (int num : array)
        {
            if (num < min)
            {
                min = num;
            }
        }
        return min;
    }

    private static double findAverage(int[] array)
    {
        int sum = 0;
        for (int num : array)
        {
            sum += num;
        }
        return (double) sum / array.length;
    }
}