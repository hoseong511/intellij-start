package day07.inherit.ex2;

/**
 * packageName    : day07.inherit.ex2
 * fileName       : ElectronicProduct
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 * 1. **기본 클래스 `ElectronicProduct` 생성**
 *      - 속성:
 *         - `productName` (제품명, 문자열)
 *         - `price` (가격, 실수형)
 *         - `manufacturer` (제조사, 문자열)
 *     - 메소드:
 *         - 생성자: 모든 속성을 매개변수로 받아 초기화합니다.
 *         - `displayInfo()`: 제품의 정보를 출력하는 메소드. 출력 예: "Samsung TV, 가격: 2000000원, 제조사: Samsung"
 */
public class ElectronicProduct {
    String productName;
    long price;
    String manufacturer;

    public void displayInfo() {
        System.out.println(this.productName + ", 가격: " + this.price + "원, 제조사: " + this.manufacturer);
    }
}
