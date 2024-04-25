package day12.stream.ex00;

import java.util.Objects;

/**
 * packageName    : day12.stream.ex00
 * fileName       : Trader
 * author         : hoho
 * date           : 4/25/24
 * description    :
 */
public class Trader {
	private String name; //
	private String city;

	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Trader(Transaction trans) {
		this.name = trans.getTrader().getName();
		this.city = trans.getTrader().getCity();
	}

	@Override
	public String toString() {
		return "Trader{" +
				"name='" + name + '\'' +
				", city='" + city + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Trader trader = (Trader) o;
		return Objects.equals(city, trader.city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(city);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
