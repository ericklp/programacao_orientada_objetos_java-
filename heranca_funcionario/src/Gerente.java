public class Gerente extends Funcionario {
	
	private Funcionario[] Funcionarios = new Funcionario[10];
	
	public Gerente(String nome, int cpf, double salario, String cargo) {
		super(nome, cpf, salario, cargo);
//		this.Funcionarios = funcionarios;
	}
	

	public Funcionario[] getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		Funcionarios = funcionarios;
	}



	public int getNumberOfFuncionarios() {
		return this.Funcionarios.length;
	}
	
	public double getBonus() 
	{
		return (this.getSalario() * 2) + (100 * getNumberOfFuncionarios());
	}

	public String printData()
	{
		return super.printData() + " bonus: " + getBonus();
	}
}

