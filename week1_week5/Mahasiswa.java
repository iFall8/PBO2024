package week1_week5;
import java.util.ArrayList;
import java.util.Iterator;
import week5.MataKuliah;

public class Mahasiswa{
    private String nama;
    private String nim;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<MataKuliah> mk = new ArrayList<MataKuliah>();

    public Mahasiswa(String nama, String nim){
        this.nim = nim;
        this.nama = nama;
    }

    public void insertNilai(double nl){
        nilai.add(nl);
    }

    public void insertMatkul(String matkul, String kelompok, int sks){
        mk.add(new MataKuliah(matkul, kelompok, sks));
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
        getNilai();
        getMataKuliah();
        //System.out.println("Usia : " + usia);
    }

    public void getNilai(){
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void getMataKuliah(){
        System.out.println("Daftar Mata Kuliah : ");
        //Menggunakan for
        for(MataKuliah matkul : mk){
            System.out.println(matkul.getNamaMatkul()+" - "+matkul.getKelompok()+" - "+matkul.getSks());
        }

        /* Cara lain, menggunakan while
        Iterator<MataKuliah> matkul = mk.iterator();
        while(matkul.hasnext()){
            MataKuliah m = matkul.next();
            System.out.println(m.getNamaMatkul()+" - "+m.getKelompok()+" - "+m.getSks());
        }
        */
    }
    
    //public static void main(String[])
}