package day08.ex02;

/**
 * packageName    : day08.ex02
 * fileName       : Main
 * author         : hoho
 * date           : 4/18/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/18/24        hoho       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        double currentTemperature = 42.5;  // 현재 기온
        double currentPrecipitation = 60.0; // 현재 강수량

        System.out.println(WeatherConstants.MIN_TEMPERATURE_ALERT);
        boolean temperatureAlert = WeatherAnalyzer.checkTemperatureAlert(currentTemperature);
        boolean precipitationAlert = WeatherAnalyzer.checkPrecipitationAlert(currentPrecipitation);

        System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
        System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true
    }
}
