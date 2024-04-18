package day07.practice;

/**
 * packageName    : day07.practice
 * fileName       : Product
 * author         : hoho
 * date           : 4/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/17/24        hoho       최초 생성
 * <p>
 * 5. **제품 재고 관리 시스템**
 * - 제품의 이름(name), 가격(price), 재고 수량(stock)을 관리하는 `Product` 클래스를 만드세요.
 * - 모든 필드를 private로 선언하고, 제품 정보를 읽거나 수정할 수 있는 public 메소드를 구현하세요.
 * - 재고를 감소시키는 메소드는 재고가 요청 수량보다 많을 때만 작동하도록 하세요.
 */
public class Product {

    private String name;
    private int price;
    private int stock;

    public void reduceStock(int stock) {
        if (this.stock < stock) {
            System.out.println("요청된 수량의 재고가 없습니다.");
            return;
        }
        this.stock -= stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("정해진 범위의 값을 요청해주세요");
            return;
        }
        this.stock = stock;
    }
}
