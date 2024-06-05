package Responsi;

public class Student extends Person {
    String nim;
    int modul, sks, spp;

    public Student(String name, String address, String nim, String hobi, int modul, int sks, int spp){
        super(name, address, hobi);
        this.nim = nim;
        this.modul = modul;
        this.sks = sks;
        this.spp = spp;
    }

    public String getNim(){
        return nim;
    }

    public int hitungPembayaran(){
        int biayaPerSks = 250000;
        return (sks * biayaPerSks) + modul + spp;
    }

    public void identity(){
        super.identity();
        System.out.println("NIM : "+ nim);
        super.Hobi();
        System.out.println("Modul : "+ modul);
        System.out.println("SKS : "+ sks);
        System.out.println("SPP : "+ spp);
        System.out.println("Tagihan Pembayaran : "+ hitungPembayaran());
    }

    
}