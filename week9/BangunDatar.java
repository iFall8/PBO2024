package week9;

public class BangunDatar{
    private int panjang;
    private int lebar;
    private double diameter;
    private int sisi;
    private static final double phi = 3.14;

    public BangunDatar(int sisi){
        this.sisi = sisi;
    }

    public BangunDatar(double diameter){
        this.diameter = diameter;
    }

    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getSisi(){
        return sisi;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public double getDiameter(){
        return diameter;
    }
    public double hitungRadius(){
        return diameter/2;
    }
    public int luas(int sisi){
        return sisi*sisi;
    }

    public int luas(int panjang, int lebar){
        return panjang*lebar;
    }

    public double luas(double diameter){
        return phi*hitungRadius()*hitungRadius();
    }

    public void infoBangun(){
        if(sisi > 0){
            System.out.println("Nama : Persegi");
            System.out.println("Sisi : " + this.sisi);
            System.out.println("Luas : " + luas(sisi));
        }

        if((panjang >  0) && (lebar > 0)){
            System.out.println("Nama : Persegi Panjang");
            System.out.println("Panjang : " + this.panjang);
            System.out.println("Lebar : " + this.lebar);
            System.out.println("Luas : " + luas(panjang, lebar));
        }

        if(diameter > 0){
            System.out.println("Nama : Lingkaran");
            System.out.println("Diameter : " + this.diameter);
            System.out.println("Luas : " + luas(diameter));
        }
    }
}
