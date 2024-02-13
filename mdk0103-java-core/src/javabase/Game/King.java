package javabase.Game;

class King extends Character
{
    private int gold;

    public King(int healthPoints, int attackPoints, int gold)
    {
        super(healthPoints, attackPoints);
        this.gold = gold;
    }

    public void earnGold(int amount)
    {
        this.gold += amount;
    }

    public int getGold()
    {
        return gold;
    }
}