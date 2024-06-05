package week9;

public class BangunRuang extends BangunDatar{
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi){
        super(panjang,lebar);
        this.tinggi = tinggi;
    }
    public BangunRuang(int sisi, int tinggi){
        super(sisi);
        this.tinggi = tinggi;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int volume(int panjang, int lebar, int tinggi){
        return super.getPanjang()*super.getLebar()*getTinggi();
    }

    public int volume(int sisi, int tinggi){
        return super.getSisi()*super.getSisi()*getTinggi();
    }

    public void infoBangunRuang(){
        if (getSisi() > 0) {
            System.out.println("Nama : Kubus");
            System.out.println("Sisi: "+getSisi());
            System.out.println("Tinggi : "+getTinggi());
            System.out.println("Volume : "+volume(getSisi(), tinggi));
        }
        if ((getPanjang() > 0) && (getLebar() > 0)) {
            System.out.println("Nama : Balok");
            System.out.println("Panjang : "+getPanjang());
            System.out.println("Lebar : "+getLebar());
            System.out.println("Tinggi : "+getTinggi());
            System.out.println("Volume : "+volume(getPanjang(), getLebar(), tinggi));
        }
         
    }
}