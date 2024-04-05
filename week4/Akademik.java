package week4;
import week1_week4.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[]args) {
        System.out.print("Masukkan Jumlah Data: ");
        int n;
        //Buat objek dari class Scanner untu menginput data
        
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        //buat variabel array dengan tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        String nama;
        Double ipk;

        for(int i = 0; i < n; i++){
            System.out.println("Data ke-" + (i+1));
            System.out.print("Masukkan NIM: ");
            nim = inp.next();
            System.out.print("Masukkan IPK: ");
            ipk = inp.nextDouble();
            System.out.print("Masukkan Nama: ");
            nama = inp.next();
            

            mhs[i] = new Mahasiswa(nim, nama, ipk);
        }

        for(int x = 0; x < n; x++){
            System.out.println("Data ke-" + (x+1));
            mhs[x].getIdentitas();
        }

    }
}