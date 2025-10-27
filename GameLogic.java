package com.example.game;

import java.util.Random;

public class GameLogic {
    private int secretNumber;

    public GameLogic() {
        Random rand = new Random();
        secretNumber = rand.nextInt(10) + 1;
    }

    public String checkGuess(int guess) {
        if (guess == secretNumber) {
            return "🎉 Correct! You guessed the number!";
        } else if (guess > secretNumber) {
            return "❌ Too high!";
        } else {
            return "❌ Too low!";
        }
    }

    public int getSecretNumber() {
        return secretNumber;
    }
}
