class calculadora
{
	public static void main (String args[])
	{
		float a, b, res;
		String operacao;

		a 			= Integer.parseInt(args[0]);
		b 			= Integer.parseInt(args[1]);
		operacao 	= args[2];

		if(operacao.equals("/"))
			res = a / b;
		else if(operacao.equals("x"))
			res = a * b;
		else if(operacao.equals("+"))
			res = a + b;
		else if(operacao.equals("-"))
			res = a - b;
		else
		{
			res = 0;
			System.out.println("Operação invalida ou não suportada.");
			return;
		}

		System.out.println("O resultado da operação " + a + " " + operacao + " " + b + " = " + res);
	}
}