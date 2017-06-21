class locadora
{
	public static void main (String args[])
	{
		double qtdeDvdsTotal, qtdeDvdsMensal, valorAluguel, faturamentoAnual, multas;

		qtdeDvdsTotal		= Double.parseDouble(args[0]);
		valorAluguel		= Double.parseDouble(args[1]);

		//variável auxiliar
		qtdeDvdsMensal   = (qtdeDvdsTotal / 3);

		faturamentoAnual = qtdeDvdsMensal * valorAluguel * 12;

		/*10% dos clientes mensais pagam uma multa de 10% no valor do aluguel*/
		multas = (qtdeDvdsMensal * 0.1) * (valorAluguel * 1.1); //100 e 5   e 1,67

		System.out.printf("O faturamento anual da locadora é de: R$%.2f \n Valor ganho com multas: R$%.2f \n", faturamentoAnual, multas);
	}
}