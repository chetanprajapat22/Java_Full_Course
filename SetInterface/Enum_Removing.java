package in.co.SetInterface;

import java.util.EnumSet;

public class Enum_Removing {
    enum Game { Cricket,Hockey , football , Tennis}

    public static void main(String[] args) {
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        System.out.println("Enum set: " + games);

        boolean value1= games.remove(Game.Cricket);
        System.out.println("Is cricket removed? " + value1);

        boolean value2 = games.removeAll(games);
        System.out.println("Are all elements removed? " + value2);
    }
}
