package day05.player;

public class Main {
    public static void main(String[] args) {
        Player hoho = new Player("hoho");
        Player hoho2 = new Player("hoho2");

        System.out.println("hoho2 = " + hoho2);
        System.out.println("hoho = " + hoho);
        hoho.attack(hoho2);
        System.out.println(hoho2.getHp());
        new Player();
    }
}
