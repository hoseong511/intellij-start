package day01;

import java.util.ArrayList;

public class DataType {
    public static void main(String[] args) {
        byte a = (1 << 7) - 1;
        short b = 32767;
        int c = 1 << 31;
        long d = ((1L << 63));
        System.out.printf("%d %d %d %d\n", a, b, c, d);

        float e = 3.131231231231231F;
        double f = 3.131231231231231;
        System.out.println("f = " + f);
        System.out.println("e = " + e);
        String asdasd = "asdasd";
        boolean b1 = a > b;

        int i = 123;
        double random = Math.random();
        System.out.println(random);

        int x = 200 + a;
        System.out.println(x);
        int x1 = b * 200;
        System.out.println(x1);

        char text = '안';
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println(hello);

    }
}
