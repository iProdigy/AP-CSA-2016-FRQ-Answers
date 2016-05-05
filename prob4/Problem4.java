package prob4;

import java.util.Arrays;

public class Problem4 {

    public static void main(String[] args) {
        final int len = 20;

        String[][] wordLists = {
                {"AP", "COMP", "SCI", "ROCKS"},
                {"GREEN", "EGGS", "AND", "HAM"},
                {"BEACH", "BALL"}
        };

        for (String[] wordList : wordLists) {
            System.out.println(StringFormatter.format(Arrays.asList(wordList), len));
        }
    }

}
