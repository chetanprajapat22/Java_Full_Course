package in.co.SetInterface;

import java.util.EnumSet;

public class Enum_CreateObj {

    enum Game {Cricket,Hockey,Tennis,Kabbadi}
    public static void main(String[] args) {

        EnumSet<Game> games = EnumSet.allOf(Game.class);

        System.out.println("Enumset: " + games);

    }
}
