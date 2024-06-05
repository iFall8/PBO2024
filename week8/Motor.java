package week8;

public class Motor extends Kendaraan{
    public String jenisMotor, nama;
    public int roda;

    public Motor(String merk, int tahun, String bahanBakar, int roda, String jenisMotor, String nama){
        super(merk, tahun, bahanBakar);
        this.roda = roda;
        this.jenisMotor = jenisMotor;
        this.nama = nama;
    }

    public int getRoda(){
        return roda;
    }
    public String getJenisMotor(){
        return jenisMotor;
    }
    public String getNama(){
        return nama;
    }

    public void setRoda(int roda){
        this.roda = roda;
    }
    public void setJenisMotor(String jenisMotor){
        this.jenisMotor = jenisMotor;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}