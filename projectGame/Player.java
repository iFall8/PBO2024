package projectGame;

import java.util.Random;

public class Player extends Character implements Action {
    private int exp;
    private int expToNextLevel;
    private boolean isDefending;
    private boolean hasFled;
    private String playerName;
    private int score;

    public Player(String playerName, String name, int health, int level) {
        super(name, health, level);
        this.playerName = playerName;
        this.exp = 0;
        this.expToNextLevel = level * 50;
        this.isDefending = false;
        this.hasFled = false;
        this.score = 0;
    }

    @Override
    public void attack(Character target) {
        Random rand = new Random();
        int damage = rand.nextInt(level * 15) + 1;
        System.out.println("===============================================================");
        System.out.println(name + " menyerang " + target.getName() + " sebanyak " + damage + " kerusakan.");
        target.takeDamage(damage);
    }

    @Override
    public void defend() {
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if (chance <= 70) { // 70% chance to successfully defend
            isDefending = true;
            System.out.println("===============================================================");
            System.out.println(name + " bertahan, dan akan menerima damage yang dikurangi.");
        } else {
            isDefending = false;
            System.out.println("===============================================================");
            System.out.println(name + " mencoba bertahan namun gagal");
        }
    }

    @Override
    public void flee() {
        Random rand = new Random();
        int chance = rand.nextInt(100) + 1;
        if (chance <= 20) {
            hasFled = true;
            System.out.println(name + " Berhasil kabur dari pertarungan!");
            increaseScore(50);
        } else {
            hasFled = false;
            System.out.println(name + " mencoba kabur namun gagal.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Player: " + name + " | HP: " + health + " | Level: " + level + " | Exp: " + exp + "/" + expToNextLevel);
    }

    public void gainExp(int exp) {
        this.exp += exp;
        increaseScore(exp);
        System.out.println(name + " mendapat " + exp + " exp.");
        checkLevelUp();
    }

    private void checkLevelUp() {
        while (exp >= expToNextLevel) {
            exp -= expToNextLevel;
            level++;
            expToNextLevel = level * 40;
            maxHealth = level * 40;
            System.out.println(name + " Naik Level! Sekarang level: " + level);
        }
    }

    public boolean isDefending() {
        return isDefending;
    }

    public boolean hasFled() {
        return hasFled;
    }

    public void resetDefend() {
        isDefending = false;
    }

    public void resetFlee() {
        hasFled = false;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    private void increaseScore(int points) {
        score += points;
        System.out.println("Skor bertambah sebanyak " + points + ". \nTotal skor: " + score);
    }

    public void decreaseScoreForTime(long minutes, long seconds) {
        score -= (minutes * 10);
        score -= (seconds * 0.1);
        System.out.println("Skor dikurangi berdasarkan waktu: " + (minutes * 10) + " poin untuk " + minutes + " menit dan " + (seconds * 0.5) + " poin untuk " + seconds + " detik.");
    }
}