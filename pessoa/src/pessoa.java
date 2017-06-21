import java.util.Scanner;

class pessoa
{
	private String nome = "";
	private int idade;
	private String endereco = "";

	public pessoa(String nome, int idade, String endereco) 
	{
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public static void main (String args[])
	{

	}

	public String getNome()
	{
		return this.nome;
	}

	public int getIDade()
	{
		return this.idade;
	}

	public String getEndereco()
	{
		return this.endereco;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	
	public void fazAniversario()
	{
		this.idade++;
	}
	
	public String imprime()
	{
		return ("nome: " + this.getNome() + " idade: " + this.getIDade() + " endereco: " + this.getEndereco());
	}
}