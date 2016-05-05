package prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Problem 1.a
 */
public class RandomStringChooser {
    private static final Random rand = new Random();
    private final List<String> words;

    public RandomStringChooser(String[] wordArray) {
        this.words = new ArrayList<>(Arrays.asList(wordArray));
    }

    /**
     * Chooses an element from the word array psuedo-randomly, or "NONE" if all have been returned
     *
     * @return a random element from the word array
     */
    public String getNext() {
        final int n = words.size();
        return (n == 0) ? "NONE" : words.remove(rand.nextInt(n));
    }

    /**
     * @return the words to choose from
     */
    public List<String> getWords() {
        return this.words;
    }

}
