import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class indice
{
	public static void main (String args[])
	{
		int i, diaMin, diaMax, len = 0;
		double soma, media, min, max;
		double aux = 0;
		String arg = "";

		double[] array = new double[7];
		double[] minAndMaxValue = new double[2];

		Scanner sc = new Scanner (System.in);


		while (len<7)
		{

			System.out.println ("---- Digite o índice pluviométrico para o dia "+len+" ----");
			arg = sc.next();

			try
			{
				aux = Double.parseDouble(arg);
			}
			catch(Exception e)
			{
				System.out.println("### Valor inválido, por favor insira novamente ###");
				continue;
			}

			array[len] = aux;
			len++;
		}

		min = max = array[0];

		for(i=0,soma=0,diaMin=0,diaMax=0; i<len; i++)
		{
	        if (array[i] > max) { 
	            max = array[i];
	            diaMax = i;
	        }
	        if (array[i] < min){
	        	min = array[i];
	        	diaMin = i;
	        }

			soma = soma+array[i];
		}


		media = soma/(len);
		System.out.println ("A soma  é de: "+ soma);
		System.out.println ("A média é de: "+ media);
		System.out.println ("O valor mínimo é de: " + min + " ,ocorreu no dia " + diaMin);
		System.out.println ("O valor máximo é de: " + max + " ,ocorreu no dia " + diaMax);
	}
}