package week9;

public class BuatBangunDatar{
    public static void main(String[] args){
        BangunDatar psg = new BangunDatar(10);
        psg.infoBangun();

        BangunDatar pp = new BangunDatar(15,8);
        pp.infoBangun();

        BangunDatar lkrn = new BangunDatar(10.0);
        lkrn.infoBangun();

        BangunRuang blk = new BangunRuang(9, 6, 5);
        blk.infoBangunRuang();

        BangunRuang kbs = new BangunRuang(8,6);
        kbs.infoBangunRuang();
    }
}