package week8;

public class motorMatic extends Motor{
    public int cc;
    public String mesin;

    public motorMatic(String merk, int tahun, String bahanBakar, int roda, String jenisMotor, String nama, int cc, String mesin){
        super(merk, tahun, bahanBakar, roda, jenisMotor, nama);
        this.cc = cc;
        this.mesin = mesin;
    }

    public int getCc(){
        return cc;
    }
    public String getMesin(){
        return mesin;
    }

    public void setCc(int cc){
        this.cc = cc;
    }
    public void setMesin(String mesin){
        this.mesin = mesin;
    }

    public void printMotorManual(){
        System.out.println("Merk : " + super.getMerk());
        System.out.println("Tahun : " + super.getTahun());
        System.out.println("Bahan bakar : " + super.getBahanBakar());
        System.out.println("Jumlah roda : " + super.getRoda());
        System.out.println("Jenis motor : " + super.getJenisMotor());
        System.out.println("Nama : " + super.getNama());
        System.out.println("CC : " + getCc());
        System.out.println("Mesin : " + getMesin());
    }
}