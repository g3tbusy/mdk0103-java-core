package Game;

public class Army
{
    private String type;
    private int hp;
    private int gold;
    private int damage;

    public Army(String type, int hp, int gold, int damage) {
        this.type = type;
        this.hp = hp;
        this.gold = gold;
        this.damage = damage;
    }
}
