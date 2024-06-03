package in.co.StreamApi;

import in.co.Collection_List.Collection.LearnList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {
    public static void main(String[] args) {

        List<Contestant> list = new ArrayList<>();

        list.add(new Contestant("vishal","9171924263"));
        list.add(new Contestant("chetan","6232647203"));
        list.add(new Contestant("nirmal","9644405822"));
        list.add(new Contestant("sonu","9669399240"));

        list.stream().map(n->n.phone)
                .filter(n->n.length()==10)
                .distinct().collect(Collectors.collectingAndThen(Collectors.toList(),n->{
            Collections.shuffle(n);
            return n.stream();
        })).limit(3).forEach(n->{
            System.out.println("Valid Numbers: "+ n);
        });
    }
}
