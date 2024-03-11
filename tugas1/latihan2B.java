package tugas1;

public class latihan2B {
    int a, t, luas;

    public void luas(int a, int t){
        double luas = a * t;
        System.out.println("Luas segitiga adalah " + luas);
    }
    public static void main(String[] args) {
        latihan2B segitiga1 = new latihan2B();
        segitiga1.luas(6,8);
    }
}
