package day07.practice;

import java.time.LocalDate;
import java.util.Date;

/**
 * packageName    : day07.practice
 * fileName       : Car
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 *
 * 4. **자동차 클래스**
 *     - 자동차의 브랜드(brand), 모델(model), 연식(year)을 캡슐화하는 `Car` 클래스를 만드세요.
 *     - 모든 필드는 private로 선언하고, 각 필드의 정보를 반환하거나 설정하는 getter와 setter 메소드를 포함하세요.
 *     - setter 메소드에서는 유효하지 않은 입력(예: 미래의 연식)을 거부할 수 있도록 검증 로직을 추가하세요.
 *
 */
public class Car {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().equals("")) {
            System.out.println("입력값을 확인해주세요!");
            return ;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.trim().equals("")) {
            System.out.println("입력값을 확인해주세요!");
            return ;
        }
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        LocalDate date = LocalDate.now();
        if (date.getYear() < year) {
            System.out.println("입력한 연도를 확인해주세요!");
            return ;
        }
        this.year = year;
    }
}
