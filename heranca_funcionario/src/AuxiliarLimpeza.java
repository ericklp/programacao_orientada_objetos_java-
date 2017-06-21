
public class AuxiliarLimpeza extends Funcionario{
	
	public AuxiliarLimpeza(String nome, int cpf, double salario, String cargo) {
		super(nome, cpf, salario, cargo);
	}

	public double getBonus() 
	{
		return this.getSalario()*0.5;
	}

	public String printData()
	{
		return super.printData() + " bonus: " + getBonus();
	}


}
