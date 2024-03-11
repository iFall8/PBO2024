package tugas1;

public class latihan2C {
    int v, d, t, r;

    public void volume(int d, int t){
        double r = d/2, v = 3.14 * r * r * t;
        System.out.println("Volume tabung adalah " + v);
    }
    public static void main(String[] args) {
        latihan2C tabung1 = new latihan2C();
        tabung1.volume(5,10);
    }
}
