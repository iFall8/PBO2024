package Responsi;
import java.util.*;

class InheritMain {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name, address, nim, hobi;

        int modul, sks,spp;

        System.out.print("Masukkan Nama : ");
        name = inp.next();
        System.out.print("Masukkan NIM : ");
        nim = inp.next();
        System.out.print("Masukkan Alamat : ");
        address = inp.next();
        System.out.print("Masukkan Modul : ");
        modul = inp.nextInt();
        System.out.print("Masukkan SKS : ");
        sks = inp.nextInt();
        System.out.print("Masukkan SPP : ");
        spp = inp.nextInt();
        System.out.print("Masukkan Hobi : ");
        hobi = inp.next();

        Student mhs1 = new Student(name, nim, address, hobi, modul, sks, spp);
        System.out.println("Data Mahasiswa");
        mhs1.identity();
    }
}