package com.raksh.tictactoe.strategies.gamewinningstrategy;

import com.raksh.tictactoe.models.Board;
import com.raksh.tictactoe.models.Cell;
import com.raksh.tictactoe.models.Player;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player playerToMove, Cell cell);
}
