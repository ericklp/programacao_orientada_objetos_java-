/*
 * 	a. Implementar o algoritmo para multiplicação de matrizes de forma sequencial (sem o
uso de threads) - DONE

*	b. Implementar um algoritmo para multiplicação de matrizes de forma paralela (conceito
de divisão e conquista), com threads - DONE

*	c. Demonstrar as diferenças entre o algoritmo sequencial e o paralelo. - DONE

*	d. Colocar contador de tempo nos dois programas (sequencial e paralelo) - DONE
	
*	e. O número de threads é um parâmetro de entrada.

*	f. Executar de 1 a 10 threads e comparar os resultados de tempo. Gerar relatório com
os tempos obtidos. Gerar um gráfico no excel. -DONE

*	g. Executar preferencialmente em uma máquina com mais de um núcleo, para que
ocorra ganho em relação ao algoritmo sequencial. - DONE*/

// TODO: considerar numero impar de threads, usar resto da divisao. //

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicaçãoMatrizesThreads {
    static int dimension=10;
    public static void main(String[] args) throws InterruptedException {
    	   	
    	
    	//variable declaration
    	int a[][] = new int[1000][1000];
    	int b[][] = new int[1000][1000];
    	//int a[][]={{1,2},{3,4}};
	    //int b[][]={{-1,3},{4,2}}; //Produto: [[7, 7], [13, 17]]
    	//int a[][]={{2,3},{0,1},{-1,4}};
    	//int a[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
    	//int b[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

    	ThreadCalcula[] thread;

        int dimensao_local=a[0].length;
        
        //System.out.println("Qual o número de threads?");
        //int nThreads=new Scanner (System.in).nextInt();

        
        int nThreads=2;
        		
        int qtdeLinhasPorThread = dimensao_local/nThreads;

        thread = new ThreadCalcula[nThreads];

        //Criando threads.
        long startTime = System.nanoTime();

        int linhaInicio = 0;
		int linhaFim = qtdeLinhasPorThread;
        DadosMatriz data1 = new DadosMatriz(a,b,dimensao_local);
        for(int k=0;k<nThreads;k++){
        	thread[k] = new ThreadCalcula(data1,linhaInicio, linhaFim,qtdeLinhasPorThread, k);
        	if( (linhaFim + qtdeLinhasPorThread) <= dimensao_local)
        	{
        		linhaInicio += qtdeLinhasPorThread;
            	linhaFim += qtdeLinhasPorThread;
        	}
        }   
        
        for(int k=0;k<nThreads;k++){
        	thread[k].t.join();  
        }
        
        long elapsedTime = System.nanoTime() - startTime;
        
        System.out.println("Total execution time using "+nThreads+" threads (in miliseconds): "
                + elapsedTime/1000000);

	    System.out.println("\nMatriz a:");
	    //System.out.println(Arrays.deepToString(a));

	    System.out.println("\nMatriz b:");
	    //System.out.println(Arrays.deepToString(b));
	    
	    System.out.println("\nProduto:");
	    //System.out.println(Arrays.deepToString(data1.c));
           
	    
    }
}

class ThreadCalcula implements Runnable{
    int[] linhaA,linhaC;
    int dimensoes_array_a,indexLinha, qtdeLinhasPorThread, idThread, indexLinhaFim, indexLinhaInicio;
    DadosMatriz objData;
    Thread t;

    ThreadCalcula(DadosMatriz objData,int linhaInico, int linhaFim, int qtdeLinhasPorThread, int k){
        dimensoes_array_a=objData.a.length;
        this.objData=objData;
        this.indexLinhaInicio=linhaInico;
        this.indexLinhaFim=linhaFim;
        this.qtdeLinhasPorThread = qtdeLinhasPorThread;
        this.idThread = k;
        t=new Thread(this);
        t.start();
        linhaC=new int[dimensoes_array_a];
    }
    public void run() {
    		System.out.println("starting thread: "+t.getName());
    		//Cada thread deverá calcular n linhas

    		for(int linha=indexLinhaInicio; linha<indexLinhaFim; linha++) {
    			 for(int i=0;i<objData.b[0].length;i++){
 	                for(int j=0;j<objData.b.length;j++){
 	                	 objData.c[linha][i]+=(objData.a[linha][j]*objData.b[j][i]);  
 	                }
 	                linhaC[i]=objData.c[linha][i];
 	            }
 	            try {
 	            	objData.copiarLinhaParaC(linhaC, linha);
 				} catch (InterruptedException e) {
 					e.printStackTrace();
 				}
    		}

            System.out.println("terminating thread: "+t.getName());
    }
}

class DadosMatriz{
    public int[][] a;
    public int[][] b;
    public int[][] c;
    public int d;
    
    boolean flag=false;
    
    DadosMatriz(int[][] a, int[][] b,int d){
        this.d = d;
        this.a = new int[d][d];
        this.a=a;
        this.b = new int[d][d];
        this.b=b;
        this.c = new int[d][d];

    }
    
    // adicionando resultados na matriz resultado
    synchronized void copiarLinhaParaC(int[] linhaC, int linha) throws InterruptedException{
    	while(flag){
    		wait();
    	}
    	flag=true;
    	
    	//copiando linha inteira
    	for(int j=0;j<d;j++){
    		c[linha][j]=linhaC[j];
    	}
    	
    	flag=false;
    	notify();
    }
}