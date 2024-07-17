package projectGame;

import java.sql.*;
import java.time.Duration;

public class savePLayer {
    public static void savePlayerData(String playerName, Duration duration, int score) {
        try (Connection conn = DatabaseUtil.getConnection()) {
            String sql = "INSERT INTO game_score (Player, Durasi, Skor) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, playerName);
            statement.setString(2, String.format("%02d:%02d:%02d", duration.toHoursPart(), duration.toMinutesPart(), duration.toSecondsPart()));
            statement.setInt(3, score);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data Player telah berhasil disimpan!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error while saving player data");
        }
    }
}
