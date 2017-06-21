import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class baskhara
{
	public static void main (String args[])
	{
		double a, b, c;

		double res[] = new double[2];

		Scanner sc = new Scanner (System.in);

		System.out.println("Digite o coeficiente A (x²):");
		a = sc.nextDouble();
		System.out.println("Digite o coeficiente B (x):");
		b = sc.nextDouble();
		System.out.println("Digite o coeficiente C (constante):");
		c = sc.nextDouble();

		res =  calcularBaskhara(a, b, c);

		System.out.println("x'="+res[0]);
		System.out.println("x''="+res[1]);
	}

	public static double[] calcularBaskhara(double a, double b, double c)
	{
		double res[] = new double[2];

		double delta = ((b*b) - (4.0 * a * c));
		System.out.println("a: "+a +" b: "+ " c:"+c);

		res[0] = ( (-a + Math.sqrt(delta)) / (2.0 * a));
		res[1] = ( (-a - Math.sqrt(delta)) / (2.0 * a));

		return res;
	} 
}