package day06.member;

import day06.member.Member;

import java.util.Arrays;

/**
 * packageName    : util
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
	private Member[] mArr;
	private static final int NOTFOUND = -1;

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

	/**
	 * @param email
	 * @return int type
	 * @method indexOf //by email
	 * @author hoho
	 * @date 2024 04 17 09:51
	 */
	public int indexOf(String email) {
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i].getEmail().equals(email)) {
				return i;
			}
		}
		return NOTFOUND;
	}

	public void insert(int index, Member newData) {

		if (index < 0 || index > size() - 1) return;
		if (index == size()) {
			push(newData);
			return;
		}

		Member[] temp = new Member[mArr.length + 1];
		for (int i = 0; i < mArr.length; i++) {
			temp[i] = mArr[i];
		}
		for (int i = temp.length - 1; i > index; i--) {
			temp[i] = temp[i - 1];
		}
		temp[index] = newData;
		mArr = temp;
	}

	public Member remove(String email) {
		int idx = indexOf(email);
		Member target = null;
		if (idx == NOTFOUND) {
			System.out.println("not found");
			return target;
		}
		Member[] temp = new Member[size() - 1];
		for (int i = 0, j = 0; i < size(); i++) {
			if (idx == i) {
				target = mArr[i];
				continue;
			}
			temp[j] = mArr[i];
			j++;
		}
		mArr = temp;
		return target;
	}

	public void set(int idx, Member arg) {
		if (idx < 0 || idx > size() - 1) return;
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
