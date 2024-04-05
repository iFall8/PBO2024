package week1_week4;

public class Mahasiswa{
    String nim, nama;
    Double ipk;

    public Mahasiswa(String nim, String nama, Double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public void belajar(){
        System.out.println(nama + " belajar");
    }

    public void mainGame(){
        System.out.println(nama + " main game");
    }

    public void getIdentitas(){
        System.out.println("Nama mahasiswa :" + nama);
        System.out.println("NIM mahasiswa : " + nim);
        //System.out.println("Usia : " + usia);
    }

    //public static void main(String[])
}