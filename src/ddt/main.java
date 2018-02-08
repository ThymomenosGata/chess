package ddt;

public class main {


    public static void main(String[] args) {
        int n = 15;
        int m[][] = new int[n][n];
        m = Chess.chessFirst(n,m);
        m = Chess.chessSecond(n,m);
        for (int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

    }
}
