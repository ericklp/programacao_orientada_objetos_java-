import java.util.Scanner;

public class pessoa
{
	private String nome = "";
	private int idade;
	private String endereco = "";

	public static void main (String args[])
	{

	}

	public getNome()
	{
		return this.nome;
	}

	public getIDade()
	{
		return this.idade;
	}

	public getEndereco()
	{
		return this.endereco;
	}

	public setNome(String nome)
	{
		this.nome = nome;
	}
	
	public setIdade(int idade)
	{
		this.idade = idade;
	}

	public setEndereco(String endereco)
	{
		this.endereco = endereco;
	} 
}