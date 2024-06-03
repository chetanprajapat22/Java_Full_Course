package in.co.StreamApi;

import java.beans.Introspector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,32,45,7,8,98,5);
//        Stream<Integer> streamData = list.stream();
//        Stream<Integer> filStream = streamData.filter(n->n%2==0);
//        Stream<Integer> sortedStream =filStream.sorted();
//        Stream<Integer> mapStream = sortedStream.map(n->n*2);
        Stream<Integer> streamData = list.stream();
        Stream<Integer> finalStream = streamData.filter(n->n%2==0).sorted().map(n->n*2);
        finalStream.forEach(n-> System.out.println(n));
    }
}
