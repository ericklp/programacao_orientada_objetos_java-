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
				System.out.println(bonus);
				break;
		}
	}
}