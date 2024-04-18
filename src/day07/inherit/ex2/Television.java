package day07.inherit.ex2;

/**
 * packageName    : day07.inherit.ex2
 * fileName       : Television
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 * 2. **서브 클래스 `Television` 생성**
 *     - `ElectronicProduct`의 서브 클래스입니다.
 *     - 추가 속성:
 *         - `screenSize` (화면 크기, 정수형)
 *     - 메소드:
 *         - 생성자: 기본 클래스의 속성과 `screenSize`를 초기화합니다.
 *         - `displayInfo()` 메소드를 오버라이드하여 화면 크기 정보도 포함하여 출력합니다.
 */
public class Television extends ElectronicProduct{

    int screenSize;

    public Television(String productName, long price, String manufacturer, int screenSize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + this.screenSize + "inches");
    }
}
