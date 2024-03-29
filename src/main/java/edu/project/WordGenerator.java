package edu.project;

import java.util.Random;


public class WordGenerator implements Dictionary {
    Random random;

    String[] words = {
        "function",
        "variable",
        "cycle",
        "condition",
        "class",
        "object",
        "array",
        "pointer",
        "operator",
        "algorithm",
        "library",
        "compiler",
        "debugger",
        "stack",
        "queue",
        "inheritance",
        "polymorphism",
        "interface",
        "exception",
        "recursion",
        "package"
    };

    public WordGenerator(Random random) {
        this.random = random;
    }

    public WordGenerator(String[] words, Random random) {
        this.random = random;
        this.words = words;
    }

//    @Override
//    public String randomWord() {
//        return words[(int) (Math.random() * words.length)];
//    }

    @Override
    public String randomWord() {
        return words[random.nextInt(words.length)];
    }
}
