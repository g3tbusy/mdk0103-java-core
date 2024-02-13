package javabase.Game;

class Enemy extends Character
{
    private int type;

    public Enemy(int healthPoints, int attackPoints, int type)
    {
        super(healthPoints, attackPoints);
        this.type = type;
    }

    public int getType()
    {
        return type;
    }
}