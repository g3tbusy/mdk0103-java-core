package javabase;

import java.util.Scanner;

public class RandGame
{
    public static void main(String[] args)
    {
        int range = 10;
        int rand = (int)(Math.random() * range);
        int attempts;
        int temp_answer;
        int isanswered = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Загадано число от 1 до 9, попробуй отгадать, у тебя есть 3 попытки");

        for(attempts = 2; attempts >= 0; attempts--)
        {
            int answer = input.nextInt();

            while ((answer < 1) || (answer > 9))
            {
                System.out.println("Введенное число выходит за пределы диапазона\nОтгадайте число от 1 до 9");
                temp_answer = input.nextInt();
                answer = temp_answer;
            }

            if(answer == rand)
            {
                System.out.println("Congrulations! Число отгадано, ответ: " + answer);
                isanswered = 1;
                break;
            }

            else
            {
                if(answer > rand)
                {
                    System.out.println("Число меньше");
                    System.out.println("Попыток осталось: " + attempts);
                }

                else
                {
                    System.out.println("Число больше");
                    System.out.println("Попыток осталось: " + attempts);
                }
            }

            if((isanswered == 0) && (attempts == 0))
            {
                System.out.println("Правильный ответ: " + rand);
            }

            else
            {
                continue;
            }
        }
    }
}
