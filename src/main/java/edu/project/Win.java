package edu.project;

public record Win(char[] state, int attempts) implements GuessResult {
    @Override
    public String message() {
        return "You win! Your word was: " + new String(state) + " You spend " + attempts + " attempts.";
    }
}
