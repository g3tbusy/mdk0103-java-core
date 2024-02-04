package exam1;

import java.math.BigDecimal;
import java.util.Scanner;

public class FinancialCalculator
{
    private static Scanner input = new Scanner(System.in);
    private static BigDecimal[] expensesForDays = new BigDecimal[30];

    public static void main(String[] args)
    {
        for(int i = 0; i < expensesForDays.length; i++) // Заполняем массив нулями (0 трат)
        {
            expensesForDays[i] = BigDecimal.valueOf(0);
        }
        mainMenu();
    }
    private static void mainMenu()
    {
        int choice;

        System.out.println("\n---Главное меню---");
        System.out.println("[1] Ввести расходы за день");
        System.out.println("[2] Просмотреть список трат за месяц");
        System.out.println("[3] Самая большая сумма расхода за месяц");
        System.out.println("[4] Конвертировать список трат за месяц в другую валюту");
        System.out.print("[5] Выход из программы\nВыбор: ");

        choice = input.nextInt();

        switch(choice)
        {
            case 1:
                enterExpensesForDay();
                break;

            case 2:
                displayExpensesForMonth();
                break;

            case 3:
                displayMaxExpense();
                break;

            case 4:
                exchangeRate();
                break;

            case 5:
                System.out.println("\nЗавершение работы, до свидания!");

                System.exit(0);

            default:
                mainMenu();
                break;
        }
    }

    private static void enterExpensesForDay()
    {
        BigDecimal tempExpense; // Переменная с введенным значением трат в день для хранения данных до проверки записи данных в этот день
        int choice = 0; // Перезаписывается при повторной итерации после выбора "Ввести трату за другой день"
        int day;

        System.out.print("Выберите день: ");
        day = input.nextInt(); // Перезаписывается при повторной итерации

        while(day < 1 || day > 30) // Проверка на правильность написания дня
        {
            System.out.println("Выбран неверный день.");
            enterExpensesForDay();
        }

        System.out.print("Введите трату за " + day + "-е число: ");
        tempExpense = input.nextBigDecimal(); // Перезаписывается при повторной итерации

        if (expensesForDays[day - 1].compareTo(BigDecimal.ZERO) > 0) // Если трата уже записана в этот день -> 1 - перезаписать, 2 - оставить
        {
            System.out.println("За " + day + "-е число записана трата в " + expensesForDays[day - 1] + " rub");
            System.out.println("Хотите ли вы перезаписать это значение?\n[1] Да\n[2] Нет\nВыбор: ");

            choice = input.nextInt();

            if(choice == 1) // Перезаписываем трат в день
            {
                choice = 0;
            }

            else if(choice == 2)
            {
                mainMenu();
            }
        }
        expensesForDays[day - 1] = tempExpense;

        System.out.print("[1] - Ввести трату за другой день\n[2] - Возврат в главное меню\nВыбор: ");
        choice = input.nextInt();

        while(choice <= 0 || choice >= 3) // Проверка на диапазон выбора
        {
            System.out.print("[1] - Ввести трату за другой день\n[2] - Возврат в главное меню\nВыбор: ");
            choice = input.nextInt();
        }

        if(choice == 1)
        {
            enterExpensesForDay();
        }

        else
        {
            mainMenu();
        }
    }

    private static void displayExpensesForMonth() // Метод для вывода всех трат в столбик по дням
    {
       for(int i = 0; i < expensesForDays.length; i++) // Вывод всех трат в столбик
       {
           System.out.println(i + 1 + " День" + " - " + expensesForDays[i] + "rub");
       }

//       BigDecimal sumExpenses = new BigDecimal(0);

//       for(int i = 0; i < expensesForDays.length; i++)
//       {
//         sumExpenses = sumExpenses.add(expensesForDays[i]);
//       }

//       System.out.println("Итого - " + sumExpenses + " rub");
       mainMenu();
    }

    private static void displayMaxExpense() // Вывод максимальной траты за месяц
    {
        BigDecimal maxExpense = new BigDecimal(0);

        for(int i = 0; i < expensesForDays.length; i++)
        {
            if (expensesForDays[i].compareTo(maxExpense) > 0)
            {
                maxExpense = expensesForDays[i];
            }
        }

        System.out.println("\nСамая большая трата за месяц - " + maxExpense + "rub");
        mainMenu();
    }

    private static void exchangeRate()
    {
        int choice;
        BigDecimal USD = new BigDecimal("90.66");
        BigDecimal EUR = new BigDecimal("98.64");
        BigDecimal CNY = new BigDecimal("12.59");

        System.out.println("\nВыберите валюту для конвертации");
        System.out.print("[1] USD\n[2] EUR\n[3] CNY\n[4] Вернуться в главное меню\nВыбор: ");

        choice = input.nextInt();

        switch(choice)
        {
            default:
                exchangeRate();
                break;

            case 1:
                for(int i = 0; i < expensesForDays.length; i++) // вывод всех трат в USD
                {
                    System.out.println(i + 1 + "День " + " - " + expensesForDays[i].divide(USD, 2, BigDecimal.ROUND_HALF_UP) + "usd");
                }
                mainMenu();
                break;

            case 2:
                for(int i = 0; i < expensesForDays.length; i++) // вывод всех трат в EUR
                {
                    System.out.println(i + 1 + "День " + " - " + expensesForDays[i].divide(EUR, 2, BigDecimal.ROUND_HALF_UP) + "eur");
                }
                mainMenu();
                break;

            case 3:
                for(int i = 0; i < expensesForDays.length; i++) // вывод всех трат в CNY
                {
                    System.out.println(i + 1 + "День " + " - " + expensesForDays[i].divide(CNY, 2, BigDecimal.ROUND_HALF_UP) + "cny");
                }
                mainMenu();
                break;

            case 4:
                mainMenu();
                break;
        }
    }
}