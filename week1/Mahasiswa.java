package week1;
public class Mahasiswa
{
    String nim,nama;
    int usia;

    public void belajar(){
        System.out.println(nama + " belajar");
    }
    public void main_game(){
        System.out.println(nama + " main game");
    }
    public void getidentitas(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Usia : " + usia);
    }
}