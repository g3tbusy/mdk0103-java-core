package javabase;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SalaryTransportMeal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int salary;
        int transportExpenses;
        int mealExpenses;
        int savings;
        int result;

        System.out.print("Введите сумму зарплаты: ");
        salary = input.nextInt();
        System.out.print("Введите сумму затрат на транспорт: ");
        transportExpenses = input.nextInt();
        System.out.print("Введите сумму затрат на еду: ");
        mealExpenses = input.nextInt();
        System.out.print("Введите возможные сбережения: ");
        savings = input.nextInt();

        if((salary + savings) < (transportExpenses + mealExpenses))
        {
            result = (transportExpenses + mealExpenses) - (salary + savings);
            System.out.println("Вам не хватает " + result + " rub");
        }
        else
        {
            result = (salary + savings) - (transportExpenses + mealExpenses);
            System.out.println("Остаток - " + result + " rub");
        }
    }
}
