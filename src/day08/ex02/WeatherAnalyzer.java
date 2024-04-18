package day08.ex02;

import static day08.ex02.WeatherConstants.*;

/**
 * packageName    : day08.ex02
 * fileName       : WeatherAnalyzer
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class WeatherAnalyzer {
    public static boolean checkTemperatureAlert(final double temperature) {
        return (MIN_TEMPERATURE_ALERT.getNumericData() > temperature ||
                MAX_TEMPERATURE_ALERT.getNumericData() < temperature);
    }

    public static boolean checkPrecipitationAlert(final double precipitation) {
        return PRECIPITATION_ALERT.getNumericData() < precipitation;
    }


}
