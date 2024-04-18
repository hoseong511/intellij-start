package day08.ex01;

/**
 * packageName    : day08.ex01
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
        Product product1 = new Product("노트북", 1000000);
        Product product2 = new Product("스마트폰", 500000);

        product1.sellProduct();
        product2.sellProduct();

        System.out.println("총 판매액: " + Store.getTotalSales());
    }
}
