package prob3;

public class Square {
    private boolean black;
    private int num;

    /**
     * Constructs one square of a crossword puzzle grid.
     * <p>
     * <b>Postcondition</b>:
     * <p>
     * - The square is black if and only if <i>isBlack</i> is true.
     * <p>
     * - The square has number <i>num</i>.
     *
     * @param isBlack whether the square is black
     * @param num     the number label of the square
     */
    public Square(boolean isBlack, int num) {
        this.black = isBlack;
        this.num = num;
    }

    public boolean isBlack() {
        return this.black;
    }

    public int getNumber() {
        return this.num;
    }
}
