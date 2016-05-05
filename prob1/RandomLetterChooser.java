package prob1;

public class RandomLetterChooser extends RandomStringChooser {

    /**
     * Problem 1.b
     * <p>
     * Constructs a random letter chooser using the given string <i>str</i>
     * <p>
     * <b>Precondition</b>: <i>str</i> contains only letters.
     *
     * @param str the word to choose letters from.
     */
    public RandomLetterChooser(String str) {
        super(getSingleLetters(str));
    }

    /**
     * Puts each letter in a String array.
     *
     * @param str the word to generate the array from
     * @return an array of single-letter strings from the passed <i>str</i>.
     */
    public static String[] getSingleLetters(String str) {
        int n = str.length();
        String[] letters = new String[n];

        for (int index = 0; index < n; index++) {
            letters[index] = String.valueOf(str.charAt(index));
        }

        return letters;
    }

}
