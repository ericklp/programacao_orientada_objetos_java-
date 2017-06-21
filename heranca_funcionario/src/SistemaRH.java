public class SistemaRH {
	 
	 public static void main(String args[])
	 {
		 Funcionario[] listaFuncionarios = new Funcionario[6];

		 listaFuncionarios[1] = new Diretor("Joao", 1234, 100000, "diretor comercial");
		 listaFuncionarios[0] = new Gerente("erick", 07232123, 10000, "gerente regional");
		 listaFuncionarios[2] = new Analista("cleber", 3333, 1000, "analista pleno");
		 listaFuncionarios[3] = new Programador("gerson", 4444, 100, "programado junior");
		 listaFuncionarios[4] = new AuxiliarLimpeza("gerson", 4444, 10, "auxiliar limpeza nivel 1");

		 imprimeRelatorio(listaFuncionarios);
		 return;
	 }
	 
	 public static void imprimeRelatorio(Funcionario[] listaFuncionarios)
	 {
		for (Funcionario funcionario: listaFuncionarios){
			if(funcionario != null){
				System.out.println(funcionario.printData());
			}
		}
		return;
	 }
}
