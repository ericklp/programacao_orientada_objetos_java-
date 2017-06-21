
public class ThreadMatriz extends Thread{
    private int row;
    private int col;
    private int [][] A;
    private int [][] B;
    private int [][] C;
    
    public ThreadMatriz(int row, int col, int[][] A, int[][] B, int[][] C) {
        this.row = row;
        this.col = col;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public void run() {
    	System.out.println("starting thread: "+getName());
        C[row][col] = (A[row][0] * B[0][col])+ (A[row][1]*B[1][col]) ; 
    }   
}
