package JavaSE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa", "AAA", "BBB", "CCC", "Edwin");
        Stream<String> stream = list.stream();   //正确写法与当时教程有出入
    }
}
