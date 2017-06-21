
public abstract class Funcionario extends Pessoa implements FuncionarioI{

	private double salario;
	private boolean ativo;

	public Funcionario(String nome, String rg, double salario, boolean ativo) {
		super(nome, rg);
		this.salario = salario;
		this.ativo 	 = ativo;
	}
	
	//Método que deve ser implementado como abstrato na classe funcionário
	 public abstract void bonifica();

	 //Muda a variável ativo para falso
	 public void demite()
	 {
		 ativo = false;
	 }
	 
	 //Retorna o valor de ativo
	 public boolean isAtivo()
	 {
		 return ativo;
	 }
	 //Retorna o valor do salário
	 public double getSalario()
	 {
		 return salario;
	 }
	 //Atribui um novo salario
	 public void setSalario(double salario)
	 {
		 this.salario = salario;
	 }
	 
	 //Retorna uma string no seguinte formato: Nome ; RG ; Salário do funcionário;
	 //[Ativo/Inativo]
	 public String toString()
	 {
		 return getNome() + " ; " + getRg() + " ; "+ getSalario() + " ; " + ativo;
	 }	
}
