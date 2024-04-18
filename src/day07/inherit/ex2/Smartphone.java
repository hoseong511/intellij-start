package day07.inherit.ex2;

/**
 * packageName    : day07.inherit.ex2
 * fileName       : Smartphone
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 * 3. **서브 클래스 `Smartphone` 생성**
 *     - `ElectronicProduct`의 서브 클래스입니다.
 *     - 추가 속성:
 *         - `storageCapacity` (저장 용량, 정수형)
 *     - 메소드:
 *         - 생성자: 기본 클래스의 속성과 `storageCapacity`를 초기화합니다.
 *         - `displayInfo()` 메소드를 오버라이드하여 저장 용량 정보도 포함하여 출력합니다.
 */
public class Smartphone extends ElectronicProduct{
    int storageCapacity;

    public Smartphone(String productName, long price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("storageCapacity Size: " + this.storageCapacity + "inches");
    }
}
