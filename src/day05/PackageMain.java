package day05;

/*
*   패키지 이름을 축약해서 사용할 때 import 사용하기
* */
/*
import day05.juice.Apple;
import day05.juice.Banana;
import day05.juice.Peach;
*/
import day05.juice.*;

/*
* 패키지와 import
* */
public class PackageMain {
    public static void main(String[] args) {
        day05.fruit.Apple a1 = new day05.fruit.Apple(); // fruit
        Apple a2 = new Apple(); // juice
        new Banana();
        new Peach();
    }
}
