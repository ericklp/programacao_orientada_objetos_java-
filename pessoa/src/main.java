import java.util.Scanner;

public class main {
	
	public static void main(String args[])
	{
		pessoa p = new pessoa(null, 0, null);
		p.setNome("Cleber");
		p.setIdade(30);
		p.setEndereco("Jardim das americas");
		System.out.println("\na) \n"+ p.imprime()+"\n");
		
		pessoa p1 = new pessoa("John", 24, "CIC");		
		System.out.println("a) e b) ");
		System.out.println("nome: " + p1.getNome() + " idade: " + p1.getIDade() + " endereco: " + p1.getEndereco());
		
		
		pessoa p2 = new pessoa("João", 20, "Atuba");
		System.out.println("\nc) \n"+ p2.imprime());
		p2.fazAniversario();
		p2.fazAniversario();
		System.out.println("\nc) \n"+ p2.imprime());
	}

}
