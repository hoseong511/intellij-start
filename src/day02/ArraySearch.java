package day02;

public class ArraySearch {
    public static void main(String[] args) {
        String[] foods = {"족발", "파스타", "치킨", "피자"};

        String target = "족발";
        int idx = -1;
        for (int i = 0; i< foods.length; i++) {
            if (foods[i].equals(target)) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.println("not found");
        } else {
            System.out.printf("found! idx : %d", idx);
        }
    }
}
