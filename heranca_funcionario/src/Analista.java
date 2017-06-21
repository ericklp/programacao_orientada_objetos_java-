
public class Analista extends Funcionario{

	public Analista(String nome, int cpf, double salario, String cargo) {
		super(nome, cpf, salario, cargo);
	}

	public double getBonus() 
	{
		return this.getSalario();
	}
	
	public String printData()
	{
		return super.printData() + " bonus: " + getBonus();
	}
}
