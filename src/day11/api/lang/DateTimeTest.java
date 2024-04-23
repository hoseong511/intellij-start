package day11.api.lang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * packageName    : day11.api.lang
 * fileName       : DateTime
 * author         : hoho
 * date           : 4/23/24
 * description    :
 */
public class DateTimeTest {
	Date date;
	Calendar calendar;
	LocalDate nowDate;
	LocalDateTime nowDateTime;

	@BeforeEach
	void before() {
		date = new Date();
		calendar = Calendar.getInstance();
		nowDate = LocalDate.now();
		nowDateTime = LocalDateTime.now();

	}

	@Test
	@DisplayName("Date Time")
	void main() {
		System.out.println("date.getTime() = " + date.getTime());

		System.out.println(calendar.getWeekYear());

		System.out.println("nowDate.getYear() = " + nowDate.getYear());
		System.out.println("nowDate.getYear() = " + nowDate.getMonthValue());

		System.out.println("nowDateTime = " + nowDateTime);

		LocalDate target = LocalDate.of(2022, 4, 15);
		System.out.println("target = " + target);

		// 빌린날짜로부터 3일 뒤 날짜 연산
		LocalDate rentalDate = LocalDate.now();
		LocalDate returnDate = rentalDate.plusDays(20);
		System.out.println("returnDate = " + returnDate);
	}

	@Test
	@DisplayName("사이 날짜 구하기")
	void 사이_날짜() {
		LocalDate hireDate = LocalDate.of(2018, 3, 6);
		LocalDate retireDate = LocalDate.of(2022, 12, 27);

		long between = ChronoUnit.DAYS.between(hireDate, retireDate);

		System.out.println("between = " + between);
	}

	@Test
	@DisplayName("날짜 포맷 바꾸기")
	void 날짜_포맷_바꾸기() {
		System.out.println(nowDateTime);

		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String dateString = nowDateTime.format(pattern);
		System.out.println("dateString = " + dateString);

	}
}
