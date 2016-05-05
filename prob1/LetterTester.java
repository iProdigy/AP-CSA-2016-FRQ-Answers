package prob1;

public class LetterTester {

    public static void main(String[] args) {
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");

        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }

}
