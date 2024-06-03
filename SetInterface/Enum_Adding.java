package in.co.SetInterface;

import java.util.EnumSet;

public class Enum_Adding {

    enum Game {Cricket,Hockey,Football,Tennis}

    public static void main(String[] args) {
        EnumSet<Game> games1 = EnumSet.allOf(Game.class);

        EnumSet<Game> games2 = EnumSet.noneOf(Game.class);
        games2.add(Game.Hockey);

        System.out.println("Enumset Using add(): " + games2);

        games2.addAll(games1);
        System.out.println("Enumset using addall () : " + games2);


    }
}
