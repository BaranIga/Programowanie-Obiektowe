import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();

        games.add(new StrategyGame());
        games.add(new AdventureGame());
        games.add(new AdventureGame());
        games.add(new StrategyGame());
        games.add(new AdventureGame());

        for (Game game : games) {
            System.out.println(game.getRating());
        }
    }
}
