package week8;

public class motorManual extends Motor{
    public int cc, gear;
    public String mesin;

    public motorManual(String merk, int tahun, String bahanBakar, int roda, String jenisMotor, String nama, int cc, String mesin, int gear){
        super(merk, tahun, bahanBakar, roda, jenisMotor, nama);
        this.cc = cc;
        this.mesin = mesin;
        this.gear = gear;
    }

    public int getCc(){
        return cc;
    }
    public String getMesin(){
        return mesin;
    }
    public int getGear(){
        return gear;
    }

    public void setCc(int cc){
        this.cc = cc;
    }
    public void setMesin(String mesin){
        this.mesin = mesin;
    }
    public void setGear(int gear){
        this.gear = gear;
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
        System.out.println("Jumlah Gear : " + getGear());
    }
}