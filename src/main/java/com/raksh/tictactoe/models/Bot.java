package com.raksh.tictactoe.models;

import com.raksh.tictactoe.factories.BotPlayingStrategyFactory;
import com.raksh.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char ch, BotDifficultyLevel difficultyLevel) {
        super(name, ch, PlayerType.BOT);
        this.botDifficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move decideMove(Board board) {
       return botPlayingStrategy.makeMove(this, board);
    }
}
