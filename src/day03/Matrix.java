package day03;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] map = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10, 11, 14, 15}
        };
        for (int[] ints : map) {
            
        }
//        System.out.printf("%s", Arrays.toString(map));
        System.out.printf("%s", Arrays.deepToString(map));
    }

}
