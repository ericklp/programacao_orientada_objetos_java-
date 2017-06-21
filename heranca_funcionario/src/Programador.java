
public class Programador extends Funcionario{

	public Programador(String nome, int cpf, double salario, String cargo) {
		super(nome, cpf, salario, cargo);
	}

	public double getBonus() 
	{
		return this.getSalario()*0.8;
	}

	public String printData()
	{
		return super.printData() + " bonus: " + getBonus();
	}

}
