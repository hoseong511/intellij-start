package day01;

public class TypeCasting {
    public static void main(String[] args) {
        byte a = 100;
        int b = a;
        System.out.println("b = " + b);

        int c = 1000; // 1024, 0b10000000000 - 24 0x400 - 0x18 = 0x3e8
        byte d = (byte) c;
        System.out.println("d = " + d);

        char cc = 'A';
        int num = 3;
        char r4 = (char) (cc + num);
        System.out.println(r4);
    }
}
