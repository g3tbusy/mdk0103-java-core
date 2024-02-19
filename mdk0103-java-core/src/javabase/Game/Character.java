package javabase.Game;

class Character
{
    protected int healthPoints;
    protected int attackPoints;

    public Character(int healthPoints, int attackPoints)
    {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public void attack(Character enemy)
    {
        enemy.takeDamage(this.attackPoints);
    }

    public void takeDamage(int Damage)
    {
        this.healthPoints -= Damage;
    }

    public boolean isAlive()
    {
        return healthPoints > 0;
    }
}
