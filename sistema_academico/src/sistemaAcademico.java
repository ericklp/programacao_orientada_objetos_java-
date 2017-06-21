import java.util.Arrays;
import java.util.Scanner;

public class sistemaAcademico {

	private static aluno[] listaAlunos = new aluno[3];
	
	public static int getPos()
	{
		for(int i=0; i<sistemaAcademico.listaAlunos.length ; i++)
		{
			if(sistemaAcademico.listaAlunos[i] == null)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int arg;
		
		System.out.println("Qual a quantidade de alunos que serão cadastrados?");
		arg = sc.nextInt();
		
		sistemaAcademico.listaAlunos = new aluno[arg];
		

		int opcao = printMenu();

		while (opcao != 0)
		{
			switch(opcao)
			{
				case 1:
					System.out.print("Insira o nome do aluno:");
					String nome = sc.next();
					
					System.out.print("Insira o grr do aluno:");
					String grr = sc.next();
					
					System.out.print("Insira o curso do aluno:");
					String curso = sc.next();
					
					System.out.print("Insira o periodo do aluno:");
					int periodo = sc.nextInt();
					
					System.out.print("Insira a idade do aluno:");
					int idade = sc.nextInt();
					
					System.out.print("Insira quantidade máxima de disciplinas do aluno:");
					int qtede = sc.nextInt();

					
					cadastrarAluno(new aluno(nome, grr, curso, periodo, idade, qtede));

					break;
				case 2:
					System.out.print("Insira o nome do aluno:");
					excluirAlunoPorNome(sc.next());
					break;
					
				case 3:
					listarAlunos();
					break;
				
				case 4:
					System.out.print("Nome do aluno para cadastrar matricula:");
					nome = sc.next();
					
					System.out.print("Disciplina matricula:");
					String disciplina = sc.next();
					
					for (aluno aluno: sistemaAcademico.listaAlunos){
						if(aluno != null && aluno.getNome().equalsIgnoreCase(nome) ){
							matricularAlunoEmDisciplina(aluno, disciplina);
						}
					}
					break;
					
				case 5:
					System.out.print("Nome do aluno para excluir matricula:");
					nome = sc.next();
					
					System.out.print("Disciplina a ser excluida:");
					disciplina = sc.next();
					
					for (aluno aluno: sistemaAcademico.listaAlunos){
						if(aluno != null && aluno.getNome().equalsIgnoreCase(nome) ){
							cancelarMatricula(aluno, disciplina);
						}
					}
					break;
				case 6:
					for (aluno aluno: sistemaAcademico.listaAlunos){
						if(aluno != null){
							System.out.print(aluno.getNome()+", ");
						}
					}
					break;
				case 7:
					System.out.print("Nome do aluno para listar matriculas:");
					nome = sc.next();

					for (aluno aluno: sistemaAcademico.listaAlunos){
						if(aluno != null && aluno.getNome().equalsIgnoreCase(nome) ){
							System.out.println( Arrays.toString(aluno.getDisciplinasMatriculadas()));
						}
					}
					break;
				default:
					System.out.println("Opção inválida.");
					break;
			}

			opcao = printMenu();
		}
		
		System.out.println("<<Exiting>>");
		return;
	}
	
	public static int printMenu()
	{
		Scanner sc = new Scanner (System.in);
		int arg;

		System.out.println(	"1 – Cadastrar Aluno \n" +
							"2 – Excluir aluno por nome \n" +
							"3 – Listar Alunos \n" +
							"4 – Matricular Aluno em Disciplina \n" +
							"5 – Cancelar Matrícula \n" +
							"6 – Imprimir lista Alunos \n" +
							"7 – Disciplinas Matriculadas \n" + 
							"0 – Sair \n ");
		arg = sc.nextInt();
		
		 
		return arg;
	}

	public static void cadastrarAluno(aluno aluno)
	{
		int pos = getPos();
		sistemaAcademico.listaAlunos[pos] = aluno;
		sistemaAcademico.listaAlunos[pos].imprime();	 
	}
	
	public static void excluirAlunoPorNome(String nomeAluno)
	{
		Scanner sc = new Scanner (System.in);		
		
		for(int i=0; i<sistemaAcademico.listaAlunos.length; i++)
		{
			if(sistemaAcademico.listaAlunos[i] == null)
			{
				System.out.println("Aluno não cadastrado:");
				return;
			}
			if(sistemaAcademico.listaAlunos[i].getNome().equals(nomeAluno))
			{
				sistemaAcademico.listaAlunos[i].imprime();
				System.out.println("Aluno cadastrado, confirmar exclusão (y)?");
				String arg = sc.next();
				if(arg.equals("y"))
				{
					sistemaAcademico.listaAlunos[i] = null;
					System.out.println("Aluno excluído.");
				}
				return;
			}
		}
		return;
		 
	}
	
	public static void listarAlunos()
	{
		for (aluno aluno: sistemaAcademico.listaAlunos){
			if(aluno != null){
				aluno.imprime();
			}
		}
	}

	public static String matricularAlunoEmDisciplina(aluno aluno, String disciplina)
	{
		return aluno.fazMatricula(disciplina);
	}
	
	public static String cancelarMatricula(aluno aluno, String	disciplina)
	{
		return aluno.cancelarMatricula(disciplina);
		
	}
	
	public static String imprimirListaDeAlunoseDisciplinas ()
	{
		return null;
		
	}
}



