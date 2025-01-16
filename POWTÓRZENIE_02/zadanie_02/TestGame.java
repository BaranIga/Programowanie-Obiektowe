package entertainment;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> game = new ArrayList<>();
        game.add(new AdventureGame());
        game.add(new StrategyGame());
        game.add(new AdventureGame());
        game.add(new StrategyGame());

        for (Game games : game) {
            System.out.println(games.getRating());
        }
    }
}
