package day03;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.printf("%s\n", Arrays.toString(foods));
    }

    static void push(String arg) {
        String[] temp = new String[foods.length + 1];

        for (int j = 0; j < foods.length; j++) {
            temp[j] = foods[j];
        }
        temp[temp.length - 1] = arg;
        foods  = temp;
    }

    static void remove(String arg) {
        int idx = indexOf(arg);
        if (idx == -1) {
            System.out.println("not found");
            return ;
        }
        String[] temp = new String[foods.length - 1];
        for (int i = 0, j = 0; i < foods.length; i++) {
            if (idx == i) {
                continue;
            }
            temp[j] = foods[i];
            j++;
        }
        foods = temp;
    }

    static int indexOf(String arg) {
        int i = 0;
        for (; i < foods.length && !foods[i].equals(arg); i++) {
            ;
        }
        return i == foods.length ? -1 : i;
    }

    static boolean include(String arg) {
        return indexOf(arg) != -1;
    }

    static void insert(int idx, String arg) {
        String[] temp = new String[foods.length + 1];

        for (int i = 0, j = 0; i < temp.length; i++) {
            if (i == idx) {
                temp[i] = arg;
                continue ;
            }
            temp[i] = foods[j];
            j++;
        }
        foods = temp;
    }

    static void modify(int idx, String arg) {
        for (int i = 0; i < foods.length; i++) {
            if (i == idx) {
                foods[i] = arg;
            }
        }
    }

    public static void main(String[] args) {
        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");

        printFoods();

        modify(2, "닭갈비");
        printFoods();

    }
}
