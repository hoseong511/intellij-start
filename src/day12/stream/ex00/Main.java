package day12.stream.ex00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : day12.stream.ex00
 * fileName       : Main
 * author         : hoho
 * date           : 4/25/24
 * description    :
 *
 *  - 자바 단점 : 널체크 문법이 없음
 *  optional 사용 시, orElse 를 이용해서 null 관리
 *
 */
public class Main {

	Trader raoul;
	Trader mario;
	Trader alan;
	Trader brian;

	List<Transaction> transactions;

	@BeforeEach
	void before() {
		raoul = new Trader("Raoul", "Cambridge");
		mario = new Trader("Mario", "Milan");
		alan = new Trader("Alan", "Cambridge");
		brian = new Trader("Brian", "Cambridge");
		transactions = List.of(
				new Transaction(brian, 2021, 300),
				new Transaction(raoul, 2022, 1000),
				new Transaction(raoul, 2021, 400),
				new Transaction(mario, 2021, 710),
				new Transaction(mario, 2022, 700),
				new Transaction(alan, 2022, 950)
		);
	}

	@Test
	void test() {
		transactions.stream()
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
	// List<Transaction>
	@Test
	void 거래_2021_오름차() {
		transactions.stream()
				.filter(trans -> trans.getYear() == 2021)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
	// List<String>
	@Test
	void 도시이름_중복제거_나열() {
		transactions.stream()
				.map(trans -> trans.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}


	// 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
	// List<Trader>
	@Test
	void CamBridge_근무하는_거래자() {
		List<Trader> collect = transactions.stream()
				.map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

	// 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
	// List<String>
	@Test
	void 거래자이름_오름차순() {
		List<String> collect = transactions.stream()
				.map(trans -> trans.getTrader().getName())
				.sorted()
				.collect(Collectors.toList());
		System.out.println("collect = " + collect);
	}

	// 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
	@Test
	void Milan_거래자가_있는지() {
		boolean b = transactions.stream()
				.anyMatch(trans -> trans.getTrader().getCity().equals("Milan"));
		System.out.println("b = " + b);
	}

	// 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
	@Test
	void Cambridge_거래액_총합() {
		int sum = transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.mapToInt(Transaction::getValue)
				.sum();
		System.out.println("sum = " + sum);
	}

	// 연습 7: 모든 거래에서 최고거래액은 얼마인가?
	@Test
	void 최고거래액() {
		int maxValue = transactions.stream()
				.mapToInt(Transaction::getValue)
				.max()
				.getAsInt();
		System.out.println("maxValue = " + maxValue);
	}


	// 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
	@Test
	void 최소거래정보() {
		Transaction minTransaction = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.get();
		System.out.println("minTransaction = " + minTransaction);
	}

	// 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
	@Test
	void 거래액_500_이상_거래정보() {
		transactions.stream()
				.filter(t -> t.getValue() >= 500)
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
	// 출력값: 752.0
	@Test
	void 최소거래제외평균() {
		int min = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.get().getValue();
		double asDouble = transactions.stream()
				.filter(trans -> trans.getValue() != min)
				.mapToDouble(Transaction::getValue)
				.average()
				.getAsDouble();
		System.out.println("asDouble = " + asDouble);
	}


	// 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
	@Test
	void Cambridge_연도별_그룹() {
		Map<Integer, List<Transaction>> cambridge = transactions.stream()
				.filter(trans -> trans.getTrader().getCity().equalsIgnoreCase("Cambridge"))
				.collect(Collectors.groupingBy(Transaction::getYear));
		System.out.println("cambridge = " + cambridge);
	}

	// 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
	// 출력 값 : 700
	@Test
	void 거래차() {
		Transaction min = transactions.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.orElse(null);
		int minValue = 0;
		if (min != null)
			minValue = min.getValue();
		int maxValue = transactions.stream()
				.mapToInt(Transaction::getValue)
				.max()
				.getAsInt();
		System.out.println(maxValue - minValue);
	}
}
