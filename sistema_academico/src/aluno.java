import java.util.Arrays;


public class aluno {
	private String nome;
	private String matricula;
	private String curso;
	private int periodo;
	private String disciplinasMatriculadas[] = new String[4]; 
	private int idade;
	private String endereco;
	private int quantidadeDisciplinasPermitidadas;
	
/*
	public static void main(String args[])
	{
		//Exercício 3 - a) b) e c)
		aluno aluno_01 = new aluno("Erick Lopes", "GRR20163147", "TADS", 4, 24, 2);
		
		aluno_01.fazMatricula("LPOO");
		aluno_01.fazMatricula("CALC1");
		aluno_01.fazMatricula("TEST");
		
		aluno_01.cancelarMatricula("CALC1");
		aluno_01.cancelarMatricula("TEST");
		
		System.out.println(aluno_01.imprime());
	}
*/
	
	public aluno(String nome, String matricula, String curso, int periodo, int idade,
			int quantidadeDisciplinasPermitidadas) 
	{
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
		this.disciplinasMatriculadas = new String[quantidadeDisciplinasPermitidadas];
		this.idade = idade;
		this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
	}
	
	public String fazMatricula(String disciplina)
	{
		String ret;

		if (quantidadeDisciplinasPermitidadas==0)
		{
			ret = "Este aluno não pode ser matriculado em nenhuma disciplina, por favor, fale com a secretaria.";
			System.out.println(ret);
			return ret;
		}
			


		for(int i=0; i<disciplinasMatriculadas.length ; i++)
		{
			if(this.disciplinasMatriculadas[i] == null)
			{
				this.disciplinasMatriculadas[i] = disciplina;
				ret = "Matrícula na disciplina " + disciplina + " executada.";
				System.out.println(ret);
				return ret;
			}
		}

		ret = "Quantidade de disciplinas excedida. O limite de	disciplinas para este aluno é de "+ quantidadeDisciplinasPermitidadas + " disciplina(s). Se desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.";
		System.out.println(ret);
		return ret;
	}
	
	public String cancelarMatricula(String disciplina)
	{
		String ret;
		for(int i=0; i<disciplinasMatriculadas.length ; i++)
		{
			if(disciplinasMatriculadas[i] == null)
			{
				ret =  "Aluno não está matriculado na disciplina " + disciplina + ", portanto não é possível cancelar esta matrícula.";
				System.out.println(ret);
				return ret;
			}
			if(disciplinasMatriculadas[i].equals(disciplina)){
				disciplinasMatriculadas[i] = null;
				ret = "Cancelamento da matrícula da disciplina " + disciplina  + " executado com sucesso. ";
				System.out.println(ret);
				return ret;
			}
		}

		ret =  "Aluno não está matriculado na disciplina " + disciplina + ", portanto não é possível cancelar esta matrícula.";
		System.out.println(ret);
		return ret;
	}
	
	public String imprime()
	{
		String ret = 		"-----------------------------------------------------------------	   \n"	+
							"Nome do Aluno: "				+ this.getNome() 					+ "\n" 	+
 							"Matricula: " 					+ this.getMatricula() 				+ "\n" 	+
							"Curso: "						+ this.getCurso()					+ "\n" 	+
							"Periodo: "						+ this.getPeriodo()					+ "\n" 	+
							"Disciplinas Matriculadas: " 	+ Arrays.toString(disciplinasMatriculadas)	+ "\n" 	+
							"-----------------------------------------------------------------";
		System.out.println(ret);
		return ret;
	}

	/*Setters e getters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String[] getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}
	public void setDisciplinasMatriculadas(String[] disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getQuantidadeDisciplinasPermitidadas() {
		return quantidadeDisciplinasPermitidadas;
	}
	public void setQuantidadeDisciplinasPermitidadas(int quantidadeDisciplinasPermitidadas) {
		this.quantidadeDisciplinasPermitidadas = quantidadeDisciplinasPermitidadas;
	}
}
