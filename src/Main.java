import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Tama", "Hachi", "suzuki", "Goro", "Nana");

        long count = names.stream().filter(name -> name.contains("a")).count();
        System.out.println(count);

    //1回目の修正で提出したコード。この書き方で繋げてしまうと、List<String>型のnamesには代入できなくなるので❌
        System.out.println("[複数条件で表示]");
        names = names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        names.forEach(System.out::println);

    // メソッドチェーン　こちらの方が主流の書き方？　
        names.stream()
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
