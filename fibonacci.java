import java.util.Scanner;

public class fibonacci
{
	public static void main (String args[])
	{
		int a = 0;
		int b = 1;
		int res ,numero;

		Scanner sc = new Scanner (System.in);
		System.out.println ("Digite o numero: ");
		numero = Integer.parseInt(sc.next());
		
		System.out.printf("%d %d ",a, b);
		do
		{
			res = a + b;
			a = b;
			b = res;
			if(numero >= res)
				System.out.printf("%d ",res);
		} while (numero >= res);

		System.out.printf("\n");
	}
}