package com.raksh.tictactoe.strategies.botplayingstrategy;

import com.raksh.tictactoe.models.Board;
import com.raksh.tictactoe.models.Move;
import com.raksh.tictactoe.models.Player;

public interface BotPlayingStrategy {
   Move makeMove(Player player , Board board);
}
