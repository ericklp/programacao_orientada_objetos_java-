import java.util.Arrays;


public class Matriz {    
	public static void main(String arg[])
	{
	    int i, j, k;

	    //int a[][]={{2,3},{0,1},{-1,4}};
	    //int b[][]={{1,2,3},{-2,0,4}};

	    //int a[][]={{1,2},{3,4}};
	    //int b[][]={{-1,3},{4,2}}; //Produto: [[7, 7], [13, 17]]

	    int a[][] = new int[1000][1000];
	    int b[][] = new int[1000][1000];

	    int[][] res = new int[ a.length ][ b[0].length ];
	    
	    // A*B = a[i][k] * b[k][j]
	    long startTime = System.nanoTime();
	    for (i = 0; i < a.length; i++){
	        for (j = 0; j < b[0].length; j++){
	            for (k = 0; k < a[0].length; k++){ // a[0].legth = number of rows of a. 
	                res[i][j] += (a[i][k] * b[k][j]);
	            }
	        }
	    }     	
	    long elapsedTime = System.nanoTime() - startTime;
        
        System.out.println("Total execution time (in miliseconds): "
                + elapsedTime/1000000);

	    System.out.println("\nMatriz A:");
	    //System.out.println(Arrays.deepToString(a));

	    System.out.println("\nMatriz b");
	    //System.out.println(Arrays.deepToString(b));
	    
	    System.out.println("\nProduto:");
	    //System.out.println(Arrays.deepToString(res));
	}
    
    
    
}
