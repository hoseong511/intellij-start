package day09.ex01.member;

import day09.ex01.Gender;
import day09.ex01.library.Book;
import day09.ex01.library.BookList;

/**
 * packageName    : day09.ex01
 * fileName       : User
 * author         : hoho
 * date           : 4/19/24
 * description    :
 */
public class BookUser {
	private String name; // 도서관 회원 이름
	private String password;
	private int age; // 도서관 회원 나이
	private Gender gender; // 성별
	private int couponCount; // 쿠폰 갯수
	private BookList rentBookList; // 빌린 책 정보들
	private BookList historyList; // 빌린 책 정보들

	public BookUser() {

	}

	@Override
	public String toString() {
		return "\n********* 회원님 정보 ***********\n" +
				"\n# 회원명: " + name +
				"\n# 나이: " + age +
				"\n# 성별: " + getGenderToString() +
				"\n# 쿠폰개수: " + couponCount;
	}

	public BookList getRentBookList() {
		return rentBookList;
	}

	public String getPassword() {
		return password;
	}

	public BookUser(String name, String password, int age, Gender gender, int couponCount) {
		rentBookList = new BookList();
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.couponCount = couponCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}
	public String getGenderToString() {
		return getGender() == Gender.MALE ? "남성" : "여성";
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}

}
