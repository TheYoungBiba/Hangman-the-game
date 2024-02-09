package edu.project;

public sealed interface GuessResult permits Win, SuccessfulGuess, Defeat, FailedGuess {
    String message();
}
