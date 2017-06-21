public class Diretor extends Funcionario {
	
	private String[] Departamentos = new String[10];
	
	public Diretor(String nome, int cpf, double salario, String cargo) {
		super(nome, cpf, salario, cargo);
	}
	
	public String[] getDepartamentos() {
		return Departamentos;
	}

	public void setDepartamentos(String[] departamentos) {
		Departamentos = departamentos;
	}

	public int getNumberOfDepartamentos() {
		return this.Departamentos.length;
	}
	
	public double getBonus() 
	{
		return (this.getSalario() * 4) + (3000 * getNumberOfDepartamentos());
	}
	
	public String printData()
	{
		return super.printData() + " bonus: " + getBonus();
	}
}