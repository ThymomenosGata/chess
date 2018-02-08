package ddt;

public class Chess {

    public static int[][] chessFirst(int n, int[][] m){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                m[i][j] = 0;
            }
        }
        return m;
    }

    public static int[][] chessSecond(int n, int[][] m){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                    if (i == j || j == n-i-1 || i == n-1 || j == n-1 || i == 0 || j == 0)
                        m[i][j] = 1;
            }
        }
        return m;
    }
}
