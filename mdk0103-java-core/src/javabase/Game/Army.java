package javabase.Game;

public class Army
{
    private String type;
    private int hp;
    private int gold;
    private int damage;

    public Army(String type, int hp, int gold, int damage)
    {
        this.type = type;
        this.hp = hp;
        this.gold = gold;
        this.damage = damage;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getGold()
    {
        return gold;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }
}
