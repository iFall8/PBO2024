package projectGame;

public abstract class Character {
    protected String name;
    protected int health;
    protected int level;
    protected int maxHealth;

    public Character(String name, int health, int level) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.maxHealth = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void resetHealth(){
        health = maxHealth;
    }

    public abstract void displayStatus();
}
