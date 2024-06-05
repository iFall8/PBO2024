package week8;

public class Kendaraan{
    public String merk, bahanBakar;
    public int tahun;

    public Kendaraan(String merk, int tahun, String bahanBakar){
        this.merk = merk;
        this.tahun = tahun;
        this.bahanBakar = bahanBakar;
    }

    public String getMerk(){
        return merk;
    }
    public int getTahun(){
        return tahun;
    }
    public String getBahanBakar(){
        return bahanBakar;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public void setBahanBakar(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }
}