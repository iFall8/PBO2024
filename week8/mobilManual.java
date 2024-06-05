package week8;

public class mobilManual extends Mobil{
    public int horsePower, gear;
    public String mesin;

    public mobilManual(String merk, int tahun, String bahanBakar, int roda, String jenisMobil, String nama, int horsePower, String mesin, int gear){
        super(merk, tahun, bahanBakar, roda, jenisMobil, nama);
        this.horsePower = horsePower;
        this.mesin = mesin;
        this.gear = gear;
    }

    public int getHorsePower(){
        return horsePower;
    }
    public String getMesin(){
        return mesin;
    }
    public int getGear(){
        return gear;
    }

    public void setHP(int horsePower){
        this.horsePower = horsePower;
    }
    public void setMesin(String mesin){
        this.mesin = mesin;
    }
    public void setGear(int gear){
        this.gear = gear;
    }

    public void printMobilManual(){
        System.out.println("Merk : " + super.getMerk());
        System.out.println("Tahun : " + super.getTahun());
        System.out.println("Bahan bakar : " + super.getBahanBakar());
        System.out.println("Jumlah roda : " + super.getRoda());
        System.out.println("Jenis mobil : " + super.getJenisMobil());
        System.out.println("Nama : " + super.getNama());
        System.out.println("Horse Power : " + getHorsePower());
        System.out.println("Mesin : " + getMesin());
        System.out.println("Jumlah Gear : " + getGear());
    }
}