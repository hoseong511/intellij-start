package day05;

import java.util.Arrays;

public class StringList {
    String[] sArr;

    StringList() {
        sArr = new String[0];
    }

    StringList(String... arg) {
        /*sArr = new String[0];
        for (int i = 0; i < arg.length; i++) {
            push(arg[i]);
        }*/
        sArr = arg;
    }

    public String toString() {
        return Arrays.toString(sArr);
    }

    public int size() {
        return sArr.length;
    }

    public void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < size(); i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    public void insert(int index, String newData) {

        if (index < 0 || index > size() - 1) return;
        if (index == size()) {
            push(newData);
            return ;
        }

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    public void remove(String arg) {
        int idx = indexOf(arg);
        if (idx == -1) {
            System.out.println("not found");
            return ;
        }
        String[] temp = new String[size() - 1];
        for (int i = 0, j = 0; i < size(); i++) {
            if (idx == i) {
                continue;
            }
            temp[j] = sArr[i];
            j++;
        }
        sArr = temp;
    }

    public void set(int idx, String arg) {
        if (idx < 0 || idx > size() -1 ) return;
        sArr[idx] = arg;
    }

    public void clear() {
        sArr = new String[0];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String[] getsArr() {
        return sArr;
    }

    public void setsArr(String[] sArr) {
        this.sArr = sArr;
    }
}
