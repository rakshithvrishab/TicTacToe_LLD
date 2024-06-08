package com.raksh.tictactoe.factories;

import com.raksh.tictactoe.models.BotDifficultyLevel;
import com.raksh.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;
import com.raksh.tictactoe.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel difficultyLevel) {
        if (difficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new RandomBotPlayingStrategy();
        }
        return null;
    }
}
