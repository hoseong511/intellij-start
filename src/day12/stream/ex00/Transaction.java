package day12.stream.ex00;

import java.util.Objects;

/**
 * packageName    : day12.stream.ex00
 * fileName       : Transaction
 * author         : hoho
 * date           : 4/25/24
 * description    :
 */
public class Transaction {
	private Trader trader;
	private int year;
	private int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Transaction that = (Transaction) o;
		return year == that.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(year);
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"trader=" + trader +
				", year=" + year +
				", value=" + value +
				'}';
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}
}
