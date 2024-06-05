package week8;

public class Mobil extends Kendaraan{
    public String jenisMobil, nama;
    public int roda;

    public Mobil(String merk, int tahun, String bahanBakar, int roda, String jenisMobil, String nama){
        super(merk, tahun, bahanBakar);
        this.roda = roda;
        this.jenisMobil = jenisMobil;
        this.nama = nama;
    }

    public int getRoda(){
        return roda;
    }
    public String getJenisMobil(){
        return jenisMobil;
    }
    public String getNama(){
        return nama;
    }

    public void setRoda(int roda){
        this.roda = roda;
    }
    public void setJenisMobil(String jenisMobil){
        this.jenisMobil = jenisMobil;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}