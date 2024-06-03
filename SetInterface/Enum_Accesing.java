package in.co.SetInterface;

import java.util.EnumSet;
import java.util.Iterator;

public class Enum_Accesing {
    enum Game{Cricket, Hockey , Football , Tennis}

    public static void main(String[] args) {
        EnumSet<Game> games = EnumSet.allOf(Game.class);
        Iterator<Game> iterate = games.iterator();
        System.out.println("Enum set");

        while (iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(" ,");
        }
    }
}
