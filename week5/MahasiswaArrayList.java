package week5;
import week1_week5.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList{
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa("Ifal", "14356");
        mhs.insertNilai(80.0);
        mhs.insertNilai(81.1);
        mhs.insertNilai(82.2);
        mhs.insertNilai(83.3);
        mhs.insertNilai(84.4);
        mhs.insertNilai(85.5);
        mhs.insertNilai(86.6);

        mhs.insertMatkul("PBO", "4226", 4);
        mhs.getIdentitas();
    }
}