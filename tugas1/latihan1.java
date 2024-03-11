package tugas1;

public class latihan1 {

    String nama, prodi, kegiatan;

    public void mahasiswa(String nama){
        System.out.println("Halo, nama saya adalah " + nama);
    }
    public void prodi(String prodi){
        System.out.println("Saya adalah mahasiswa " + prodi);
    }
    public void kegiatan(String kegiatan){
        System.out.println("Saya sedang " + kegiatan);
    }
    public static void main(String[] args) {
        latihan1 mhs1 = new latihan1();
        mhs1.mahasiswa("Gatot Ifal Falaah Waskitha");
        mhs1.prodi("Teknik Informatika Universitas Dian Nuswantoro");
        mhs1.kegiatan("menulis program java");
    }
}
