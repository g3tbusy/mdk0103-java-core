package javabase.Game;

public class Game
{
    public static void main(String[] args)
    {
        Army knight = new Army("Knight", 100, 100, 100);
        Army footSoldier = new Army("footSoldier", 100, 100, 100);

        Enemies enemy1 = new Enemies("enemy1", 100, 0, 5);
        Enemies enemy2 = new Enemies("enemy2", 100, 50, 10);
        Enemies enemy3 = new Enemies("enemy3", 100, 100, 50);

        King king = new King(100,100);


    }
}
