package com.raksh.tictactoe.strategies.botplayingstrategy;

import com.raksh.tictactoe.models.*;


public class RandomBotPlayingStrategy implements BotPlayingStrategy {

    @Override
    public Move makeMove(Player player , Board board) {
        for(int i=0;i<board.getBoard().size();i++) {
            for(int j=0;j<board.getBoard().size();j++) {
                if(board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    //Bot can fill this cell (i,j)
                    return new Move(player, new Cell(player,i,j,CellState.FILLED));
                }
            }
        }
        return null;
    }
}
