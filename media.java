import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class media
{
	public static void main (String args[])
	{
		int i, len = 0;
		double soma, media;
		double aux = 0;
		String arg = "";

		double[] array = new double[10];

		Scanner sc = new Scanner (System.in);


		while (true)
		{

			System.out.println ("---- Digite o número ou (\"S\") para encerrar ----");
			arg = sc.next();

			if(arg.equals("S")){
				System.out.println ("!!!Inserção de valores finalizada!!!");
				break;
			}

			try
			{
				aux = Double.parseDouble(arg);
			}
			catch(Exception e)
			{
				System.out.println("### Valor inválido, por favor tente novamente ###");
				continue;
			}

			array[len] = aux;
			len++;
		}

		for(i=0,soma=0; i<len; i++)
		{
			soma = soma+array[i];
			System.out.println ("Soma="+ soma);
		}

		media = soma/(len);

		System.out.println ("A média é de "+ media);
	}
}