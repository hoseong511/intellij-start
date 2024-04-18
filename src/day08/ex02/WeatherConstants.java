package day08.ex02;

/**
 * packageName    : day08.ex02
 * fileName       : WeatherConstants
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public enum WeatherConstants {

	MAX_TEMPERATURE_ALERT(40.0), MIN_TEMPERATURE_ALERT(-10.0), PRECIPITATION_ALERT(50.0);

	private double numericData;

	WeatherConstants(double numericData) {
		this.numericData = numericData;
	}

	public double getNumericData() {
		return numericData;
	}
}
