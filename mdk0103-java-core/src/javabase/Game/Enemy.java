package javabase.Game;

class Enemy extends Character
{
    private int type;

    public Enemy(int healphPoints, int attackPoints, int type)
    {
        super(healphPoints, attackPoints);
        this.type = type;
    }

    public int getType()
    {
        return type;
    }
}
