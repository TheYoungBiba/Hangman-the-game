package edu.project;

public record Defeat(String answer, int attempts) implements GuessResult {
    @Override
    public String message() {
        return "You loose! Your word was: " + answer + " You spend " + attempts + " attempts.";
    }
}
