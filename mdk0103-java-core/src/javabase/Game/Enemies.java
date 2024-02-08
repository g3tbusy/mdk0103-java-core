package javabase.Game;

public class Enemies
{
    private String type;
    private int hp;
    private int gold;
    private int damage;

    public Enemies(String type, int hp, int gold, int damage)
    {
        this.type = type;
        this.hp = hp;
        this.gold = gold;
        this.damage = damage;
    }
}
