package day06.util;

import day06.member.Member;

import java.util.Arrays;

/**
 * packageName    : day06.util
 * fileName       : MemberList
 * author         : hoho
 * date           : 4/16/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/16/24        hoho       최초 생성
 */
public class MemberList {
    Member[] mArr;
    MemberList() {
        this.mArr = new Member[0];
    }

    public String toString() {
        return Arrays.toString(mArr);
    }

    public int size() {
        return mArr.length;
    }

    public void push(Member newData) {
        Member[] temp = new Member[mArr.length + 1];
        for (int i = 0; i < size(); i++) {
            temp[i] = mArr[i];
        }
        temp[temp.length - 1] = newData;
        mArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(Member target) {
        for (int i = 0; i < mArr.length; i++) {
            if (target.getId() == mArr[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(Member target) {
        return indexOf(target) != -1;
    }

    public void insert(int index, Member newData) {

        if (index < 0 || index > size() - 1) return;
        if (index == size()) {
            push(newData);
            return ;
        }

        Member[] temp = new Member[mArr.length + 1];
        for (int i = 0; i < mArr.length; i++) {
            temp[i] = mArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        mArr = temp;
    }

    public void remove(Member arg) {
        int idx = indexOf(arg);
        if (idx == -1) {
            System.out.println("not found");
            return ;
        }
        Member[] temp = new Member[size() - 1];
        for (int i = 0, j = 0; i < size(); i++) {
            if (idx == i) {
                continue;
            }
            temp[j] = mArr[i];
            j++;
        }
        mArr = temp;
    }

    public void set(int idx, Member arg) {
        if (idx < 0 || idx > size() -1 ) return;
        mArr[idx] = arg;
    }

    public void clear() {
        mArr = new Member[0];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Member[] getmArr() {
        return mArr;
    }

    public void setmArr(Member[] mArr) {
        this.mArr = mArr;
    }
}
