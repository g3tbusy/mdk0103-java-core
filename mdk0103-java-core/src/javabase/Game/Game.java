package javabase.Game;

import java.util.Random;

public class Game
{
    public static void main(String[] args)
    {
        King king = new King(100, 20, 0);

        // Создание армии
        Character[] army = new Character[5];

        army[0] = new Character(50, 10); // Пехотинец
        army[1] = new Character(70, 15); // Пехотинец
        army[2] = new Character(80, 15); // Пехотинец
        army[3] = new Character(60, 20); // Рыцарь
        army[4] = new Character(90, 25); // Рыцарь

        // Создание врагов
        Enemy[] enemies = new Enemy[10];
        Random random = new Random();

        for (int i = 0; i < enemies.length; i++)
        {
            int type = random.nextInt(3) + 1;

            if (type == 1)
            {
                enemies[i] = new Enemy(30, 5, type);
            }
            else if (type == 2)
            {
                enemies[i] = new Enemy(50, 10, type);
            }
            else
            {
                enemies[i] = new Enemy(100, 50, type);
            }
        }

        // Битва
        for (Enemy enemy : enemies)
        {
            if (!king.isAlive())
            {
                System.out.println("король кердык");
                break;
            }

            for (Character ally : army)
            {
                if (!enemy.isAlive())
                {
                    System.out.println("враг повержен");
                    king.earnGold(enemy.getType() == 1 ? 0 : enemy.getType() == 2 ? 50 : 100);
                    break;
                }

                if (!ally.isAlive())
                {
                    continue;
                }

                ally.attack(enemy);

                if (!enemy.isAlive())
                {
                    System.out.println("враг повержен");
                    king.earnGold(enemy.getType() == 1 ? 0 : enemy.getType() == 2 ? 50 : 100);
                    break;
                }

                enemy.attack(ally);
                if (!ally.isAlive())
                {
                    System.out.println("союзник отхватил люлей");
                }
            }
        }
        System.out.println("золота отнято у короля: " + king.getGold());
    }
}
