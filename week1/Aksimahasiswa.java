package week1;
public class Aksimahasiswa{
    public static void main(String[] args)
    {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "A11.2022.14356";
        mhs1.nama = "Gatot Ifal Falaah Waskitha";
        mhs1.usia = 20;
        mhs1.getidentitas();
        mhs1.belajar();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "A11.2022.14355";
        mhs2.nama = "Kiagus Riyasqie Resadu";
        mhs2.usia = 19;
        mhs2.getidentitas();
        mhs2.main_game();
    }
}