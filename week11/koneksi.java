package week11;

import java.sql.*;
import java.util.Scanner;

public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/pbo_koneksi";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Insert");
            System.out.println("2. Show");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    update(scanner);
                    break;
                case 4:
                    delete(scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
        scanner.close();
    }

    public static void insert(Scanner scanner) {
        scanner.nextLine();  // Consume newline
        
        System.out.println("Masukkan Judul Buku:");
        String judul_buku = scanner.nextLine();
        
        System.out.println("Masukkan Tahun Terbit:");
        int tahun_terbit = scanner.nextInt();
        
        System.out.println("Masukkan Stok:");
        int stok = scanner.nextInt();
        
        System.out.println("Masukkan ID Penulis:");
        int id_penulis = scanner.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, id_penulis) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, id_penulis);
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void show() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM buku");
            int i = 1;
            while(rs.next()) {
                System.out.println("Data ke-" + i);
                System.out.println("ID Buku: " + rs.getString("id_buku"));
                System.out.println("Judul Buku: " + rs.getString("judul_buku"));
                System.out.println("Tahun Terbit: " + rs.getString("tahun_terbit"));
                System.out.println("Stok: " + rs.getString("stok"));
                System.out.println("ID Penulis: " + rs.getString("id_penulis"));
                i++;
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void update(Scanner scanner) {
        System.out.println("Masukkan ID Buku yang akan diupdate:");
        int id_buku = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Masukkan Judul Buku baru:");
        String judul_buku = scanner.nextLine();
        
        System.out.println("Masukkan Tahun Terbit baru:");
        int tahun_terbit = scanner.nextInt();
        
        System.out.println("Masukkan Stok baru:");
        int stok = scanner.nextInt();
        
        System.out.println("Masukkan ID Penulis baru:");
        int id_penulis = scanner.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE buku SET judul_buku = ?, tahun_terbit = ?, stok = ?, id_penulis = ? WHERE id_buku = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, id_penulis);
            ps.setInt(5, id_buku);
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Scanner scanner) {
        System.out.println("Masukkan ID Buku yang akan dihapus:");
        int id = scanner.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "DELETE FROM buku WHERE id_buku = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}