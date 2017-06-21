import java.util.Scanner;

public class calculadorBonus
{
	public static void main (String args[])
	{
		String strCargo;
		float salarioAtual, bonus;
		int departamentos, pessoas;

		Scanner sc = new Scanner (System.in);
		System.out.println ("Digite o cargo: ");
		strCargo = sc.next();
		System.out.println ("Digite o salário atual: ");
		salarioAtual = sc.nextInt();
		
		switch (strCargo.toLowerCase())
		{
			case "diretor":
				System.out.println ("Quantidade de departamentos gerenciados: ");
				departamentos = Integer.parseInt(sc.next());
				bonus = (salarioAtual * 4) + (3000 * departamentos);
				break;
			case "gerente":
				System.out.println ("Quantidade de pessoas gerenciadas: ");
				pessoas = Integer.parseInt(sc.next());
				bonus = (salarioAtual * 2) + (100 * pessoas);
				break;
			case "analista":
				bonus = salarioAtual;
				break;
			case "programador":
				bonus = (float)(salarioAtual*0.8);
				break;
			case "auxiliar":
				bonus = (float)(salarioAtual*0.5);
				break;
			default:
				bonus=0;
				break;
		}

		System.out.printf("Seu bônus será de: R$%.2f \n",bonus);
	}
}