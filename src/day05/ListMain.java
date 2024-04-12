package day05;

public class ListMain {
    public static void main(String[] args) {
        StringList a = new StringList();
        System.out.println("asdf " + a.size());
        a.push("hihi");
        a.push("hihi");
        a.push("hihi");
        a.push("hihi");
        a.push("hihi");
        a.insert(2, "hoho");
        a.insert(6, "hoho");
        System.out.println(a.toString());
//      배열 데이터 수정
        StringList hobbies = new StringList("a", "b", "c", "aaaa");
        hobbies.push("d");
        System.out.println(hobbies.toString());

    }
}
