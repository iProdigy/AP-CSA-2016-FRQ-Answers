package prob3;

public class Problem3 {

    public static void main(String[] args) {
        boolean[][] black = new boolean[7][9];
        black[0][0] = black[0][3] = black[0][4] = black[0][5] = black[1][4] = black[2][6] = black[2][7] = black[2][8] =
                black[3][2] = black[3][6] = black[4][0] = black[4][1] = black[4][2] = black[5][4] =
                        black[6][3] = black[6][4] = black[6][5] = black[6][8] = true;

        Crossword cw = new Crossword(black);
        System.out.print(cw);
    }

}
