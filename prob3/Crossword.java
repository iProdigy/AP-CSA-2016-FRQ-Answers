package prob3;

public class Crossword {
    /**
     * Each element is a {@link prob3.Square} object with a color (black or white) and a number.
     */
    private Square[][] puzzle;

    /**
     * Problem 3.b
     * <p>
     * Constructs a crossword puzzle grid.
     * <p>
     * <b>Precondition</b>: There is at least one row in <i>blackSquares</i>
     * <p>
     * <b>Postcondition</b>:
     * - The crossword puzzle grid has the same dimensions as <i>blackSquares</i>.
     * <p>
     * - The {@link prob3.Square} object a row <i>r</i>, column <i>c</i> is in the crossword puzzle grid is black
     * if and only if <i>blackSquares[r][c]</i> is <i>true</i>.
     * <p>
     * - The squares in the puzzle are labeled according to the crossword puzzle rule.
     *
     * @param blackSquares a 2d array representing which squares are black
     */
    public Crossword(boolean[][] blackSquares) {
        final int rows = blackSquares.length,
                cols = blackSquares[0].length;

        this.puzzle = new Square[rows][cols];

        int num = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                final boolean black = blackSquares[r][c];
                final boolean label = toBeLabeled(r, c, blackSquares);
                this.puzzle[r][c] = new Square(black, label ? num++ : 0);
            }
        }
    }

    /**
     * Problem 2.a
     * <p>
     * Checks whether the {@link prob3.Square} at row <i>r</i>, column <i>c</i> should be labeled
     * <p>
     * <b>Precondition</b>: <i>r</i> and <i>c</i> are valid indexes in <i>blackSquares</i>
     *
     * @param r            the row of the Square
     * @param c            the column of the Square
     * @param blackSquares the squares that are black
     * @return true if it should be labeled with a positive number, false otherwise.
     */
    private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
        boolean dark = blackSquares[r][c];

        if (dark)
            return false;

        if (r == 0 || c == 0)
            return true;

        return blackSquares[r][c - 1] || blackSquares[r - 1][c];
    }

    /*
     * Methods below this point were not expected to be written on the exam
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        final String separator = ", ";

        for (Square[] row : this.puzzle) {
            for (Square sq : row) {
                sb.append(sq.getNumber());
                sb.append(separator);
            }

            sb.setLength(sb.length() - separator.length());
            sb.append("\n");
        }

        return sb.toString();
    }
}
