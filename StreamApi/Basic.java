package in.co.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,5,6,7,3,4);

        Stream<Integer> streamData = list.stream();

        streamData.forEach(n-> System.out.println(n));
    }
}
