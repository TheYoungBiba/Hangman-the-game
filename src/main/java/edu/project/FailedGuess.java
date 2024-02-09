package edu.project;

public record FailedGuess(char[] state, int attempts) implements GuessResult {
    @Override
    public String message() {
        return "Unsuccessful guess. Your word is: " + new String(state) + " You spend " + attempts + " attempts.";
    }
}
