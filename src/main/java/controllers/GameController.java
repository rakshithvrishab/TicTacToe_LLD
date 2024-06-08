package controllers;

import com.raksh.tictactoe.models.Game;
import com.raksh.tictactoe.models.GameStatus;
import com.raksh.tictactoe.models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> players) {
        try {
            return Game.getBuilder()
                    .setPlayers(players)
                    .setDimension(dimension)
                    .build();
        } catch (Exception e) {
            return null;
        }
    }

    public void undo(Game game) {
    }

    public void displayBoard(Game game) {
        game.displayBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void executeNextMove(Game game) {
        //implementation.
        game.makeNextMove();
    }

    public GameStatus getGameStatus(Game game) {
        return game.getGameStatus();
    }
}
