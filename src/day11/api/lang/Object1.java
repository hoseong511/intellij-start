package day11;

import java.util.Objects;

/**
 * packageName    : day11
 * fileName       : Object1
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */

class Pen {
	/*
	*
	* */
	long serial;
	String color;
	int price;
	Company company;

	public Pen(long serial, String color, int price) {
		this.serial = serial;
		this.color = color;
		this.price = price;
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		Pen pen = (Pen) o;
//		return serial == pen.serial && price == pen.price && Objects.equals(color, pen.color) && Objects.equals(company, pen.company);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(serial, color, price, company);
	}

	@Override
	public String toString() {
		return "Pen{" +
				"serial=" + serial +
				", color='" + color + '\'' +
				", price=" + price +
				", company=" + company +
				'}';
	}

}

class Company extends Object {

	String companyName; // 회사명
	String address; // 회사 주소

	public Company(String companyName, String address) {
		this.companyName = companyName;
		this.address = address;
	}

	@Override
	protected void finalize() {
		System.out.println("desturcture");
	}
}

public class Object1 extends Object{
	public static void main(String[] args) {
		Company company2 = new Company("모나미", "서울");
		Company company3 = new Company("모나미", "서울");
		Company company = new Company("모나미", "서울");
		System.out.println("company = " + company);
		System.out.println("company2 = " + company2);
		System.out.println("company3 = " + company3);

		Pen yellowPen = new Pen(100L, "yellow", 1000	);
		System.out.println(company.hashCode());
		System.out.println(company2.hashCode());
		System.out.println(company3.hashCode());
		System.out.println(company.equals(company2));
		company = null;
		System.gc();
		System.out.println(company);
//		System.out.println(company.finalize());

//		System.out.println("yellowPen.company = " + yellowPen.company);
	}

}
