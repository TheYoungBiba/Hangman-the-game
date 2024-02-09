package edu.project;

public record SuccessfulGuess(char[] state, int attempts) implements GuessResult {
    @Override
    public String message() {
        return "Successful guess! Your word is: " + new String(state) + " You spend " + attempts + " attempts.";
    }
}
