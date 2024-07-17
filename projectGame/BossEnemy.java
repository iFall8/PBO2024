package projectGame;

import java.util.Random;

public class BossEnemy extends Enemy {
    public BossEnemy(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void attack(Character target) {
        Random rand = new Random();
        int damage = rand.nextInt(level * 15) + 1;
        System.out.println(name + " (Boss) attacks " + target.getName() + " for " + damage + " damage. \n===============================================================");
        target.takeDamage(damage);
    }
}

