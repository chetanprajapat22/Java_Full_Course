package in.co.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramCount {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,5,6,6,7,8);

        Stream<Integer> streamcou = list.stream();

        long count = streamcou.count();

        streamcou.forEach(n-> System.out.println(n));
    }
}
