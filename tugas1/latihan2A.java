package tugas1;

public class latihan2A {
    int d, k;

    public void keliling(int d){
        double k = 3.14 * d;
        System.out.println("Keliling lingkaran adalah " + k);
    }
    public static void main(String[] args) {
        latihan2A lingkaran1 = new latihan2A();
        lingkaran1.keliling(10);
    }
}
