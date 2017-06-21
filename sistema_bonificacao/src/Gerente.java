
public class Gerente extends Funcionario {

	public Gerente (String nome, String rg, double salario, boolean ativo)
	{
		super(nome, rg, salario, ativo);
	}

	public void bonifica() {
		setSalario(getSalario()*1.3);
		
	}
}
