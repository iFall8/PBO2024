package projectGame;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.Duration;


public class RPGGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Player:");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName, "Hero", 100, 2);

        Enemy[] enemies = {
            new Enemy("Goblin", 50, 2),
            new Enemy("Golem", 70, 3),
            new BossEnemy("Ancient Dragon", 150, 10)
        };

        int[] expRewards = {100, 250, 500};

        LocalDateTime startTime = LocalDateTime.now();

        int stage = 0;
        boolean gameContinues = true;

        while (stage < enemies.length && gameContinues) {
            Enemy enemy = enemies[stage];
            enemy.resetHealth();
            
            while (true) {
                System.out.println("===============================================================");
                player.displayStatus();
                enemy.displayStatus();
                System.out.println("===============================================================");
                System.out.println("Pilih Aksi: (1) Serang (2) Bertahan (3) Kabur (4) Ulangi Level");

                String action = scanner.nextLine();
                try {
                    switch (action) {
                        case "1":
                            player.attack(enemy);
                            break;
                        case "2":
                            player.defend();
                            break;
                        case "3":
                            player.flee();
                            if (player.hasFled()) {
                                System.out.println("Kamu berhasil kabur dari pertarungan!");
                                // Mencatat waktu
                                LocalDateTime endTime = LocalDateTime.now();
                                Duration duration = Duration.between(startTime, endTime);
                                long minutes = duration.toMinutes();
                                long seconds = duration.minusMinutes(minutes).getSeconds();
                                System.out.println(player.getPlayerName() + ", kamu kabur dari permainan! \nDurasi: " + minutes + " menit dan " + seconds + " detik.");
                                player.decreaseScoreForTime(minutes, seconds); // Kurangi skor berdasarkan durasi
                                System.out.println("Skor Final: " + player.getScore());
                                savePLayer.savePlayerData(player.getPlayerName(), duration, player.getScore());
                                gameContinues = false;
                                break;
                            }
                            break;
                        case "4":
                            System.out.println("Mengulang level...");
                            enemy.resetHealth(); // Reset health of the enemy
                            player.resetHealth();
                            continue;
                        default:
                            throw new IllegalArgumentException("Pilihan Tidak Valid. Silahkan pilih aksi yang ada");
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    //System.out.println(e.getMessage());
                }

                if (!gameContinues) break;

                // Enemy turn
                if (enemy.isAlive()) {
                    enemy.attack(player);
                }

                player.resetDefend();
                player.resetFlee();

                if (!enemy.isAlive()) {
                    System.out.println("Selamat kamu telah mengalahkan " + enemy.getName() + "!");
                    player.gainExp(expRewards[stage]);
                    player.resetHealth();
                    break;
                }

                if (!player.isAlive()) {
                    System.out.println("Kamu Kalah");
                    gameContinues = false;
                    break;
                }
            }

            if (!gameContinues) break;

            if (stage == enemies.length - 2) { // Sebelum melawan boss
                System.out.println("Apakah kamu ingin melawan boss sekarang? \n(1) Ya    (2) Tidak");
                String fightBoss = scanner.nextLine();
                if (!fightBoss.equalsIgnoreCase("1")) {
                    System.out.println("Kamu memilih untuk menunda melawan boss, kamu bisa grind level terlebih dahulu.");
                    stage = -1; // Reset stage to grind levels
                }
            }

            stage++;
        }

        if (player.isAlive()) {
            System.out.println("Selamat! Kamu mengalahkan semua musuh!, Hebat!");
        }

        // Catat waktu selesai permainan
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        long seconds = duration.minusMinutes(minutes).getSeconds();
        System.out.println(player.getPlayerName() + ", kamu menyelesaikan gamenya! \nDurasi: " + minutes + " menit dan " + seconds + " detik.");
        player.decreaseScoreForTime(minutes, seconds); // pengurangan skor berdasarkan durasi
        System.out.println("Skor Final: " + player.getScore());

        savePLayer.savePlayerData(player.getPlayerName(), duration, player.getScore());

        scanner.close();
    }
}