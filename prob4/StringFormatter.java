package prob4;

import java.util.List;

public class StringFormatter {

    /**
     * Problem 4.a
     * <p>
     * Counts the number of characters of the words within the list of words
     * <p>
     * <b>Precondition</b>: <i>wordList</i> contains at least two words, consisting of letters only.
     *
     * @param wordList the list of words to count
     * @return the total number of letters in <i>wordList</i>
     */
    public static int totalLetters(List<String> wordList) {
        int n = 0;

        for (String word : wordList) {
            n += word.length();
        }

        return n;
    }

    /**
     * Problem 4.b
     *
     * @param wordList     the list of words
     * @param formattedLen the final formatted length
     * @return the basic gap width
     */
    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        final int letters = totalLetters(wordList),
                spaces = formattedLen - letters,
                gaps = wordList.size() - 1;

        return spaces / gaps;
    }

    /**
     * Formats the words in <i>wordList</i> according to the <i>formattedLen</i>
     * <p>
     * <b>Precondition</b>:
     * <p>
     * - The <i>wordList</i> contains at least two words, consisting of letters only.
     * <p>
     * - The <i>formattedLen</i> is large enough for all the words and gaps.
     * <p>
     * <b>Precondition</b>:
     * <p>
     * - All words in <i>wordList</i> appear in the formatted string
     * <p>
     * - The words appear in the same order as in <i>wordList</i>
     * <p>
     * - The number of spaces between words is determined by {@link StringFormatter#basicGapWidth(List, int)} and the
     * distribution of {@link StringFormatter#leftoverSpaces(List, int)} from left to right.
     *
     * @param wordList     the list of words to be formatted
     * @param formattedLen the final formatted length
     * @return a formatted string consisting of the words in <i>wordList</i> separated by spaces.
     */
    public static String format(List<String> wordList, int formattedLen) {
        StringBuilder sb = new StringBuilder();

        final int bGap = basicGapWidth(wordList, formattedLen),
                extra = leftoverSpaces(wordList, formattedLen);

        for (int i = 0; i < bGap; i++) {
            sb.append(" ");
        }
        String gap = sb.toString();
        sb.setLength(0);

        int n = 0;
        for (String word : wordList) {
            sb.append(word);
            sb.append(gap);

            if (n < extra) {
                sb.append(" ");
                n++;
            }
        }

        sb.setLength(sb.length() - gap.length());

        return sb.toString();
    }

    /*
     * Methods below this point were not expected to be written during the exam
     */

    public static int leftoverSpaces(List<String> wordList, int formattedLen) {
        final int letters = totalLetters(wordList),
                spaces = formattedLen - letters,
                gaps = wordList.size() - 1;

        return spaces % gaps;
    }

}
