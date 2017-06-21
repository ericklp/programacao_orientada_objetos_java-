
public abstract class Funcionario {
	private String nome;
	private int cpf;
	private double salario;
	private String cargo;

	public Funcionario(String nome, int cpf, double salario, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public abstract double getBonus();

	public String printData()
	{
		return "Nome: " + getNome() + " CPF: " + getCpf() + " Salário: " + getSalario() + " cargo: " + getCargo();
	}
}