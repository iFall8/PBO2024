package projectGame;

import java.util.Random;

public class Enemy extends Character {
    public Enemy(String name, int health, int level) {
        super(name, health, level);
    }

    @Override
    public void displayStatus() {
        System.out.println("Musuh: " + name + " | HP: " + health + " | Level: " + level);
    }

    public void attack(Character target) {
        Random rand = new Random();
        int damage = rand.nextInt(level * 10) + 1;
        if (target instanceof Player && ((Player) target).isDefending()) {
            damage /= 3;
            System.out.println(name + " menyerang " + target.getName() + " sebanyak " + damage + " kerusakan (dikurangi karena bertahan).");
        } else {
            System.out.println(name + " menyerang " + target.getName() + " sebanyak " + damage + " kerusakan.");
        }
        target.takeDamage(damage);
    }
}

