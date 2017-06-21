import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class diagonais
{
	public static void main (String args[])
	{
		int i, j;

		Scanner sc = new Scanner (System.in);

		System.out.println("Digite as dimensões da matriz");
		System.out.printf("Linhas: 	");
		i = sc.nextInt();
		System.out.printf("Colunas:	");
		j = sc.nextInt();

		int[][] matriz = new int[i][j];

		for(int aux1=0; aux1 < i ; aux1++){
			for(int aux2=0; aux2 < j ; aux2++){
				System.out.println("Valor linha: " + aux1 + " coluna: " + aux2 + " = " + matriz[i][j] );
			}
		}
	}
}