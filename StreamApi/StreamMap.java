package in.co.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,32,45,7,8,98,8);

        Stream<Integer> streamData = list.stream();
        Stream<Integer> sortedStream =streamData.sorted();
        Stream<Integer> mapStream = sortedStream.map(n->n*2);

        mapStream.forEach(n-> System.out.println(n));
    }
}
