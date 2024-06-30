package lld.TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1", 'X'));
        players.add(new Player("Player 2", 'O'));

        Game game = new Game(3, players);
        game.startGame();
    }
}
