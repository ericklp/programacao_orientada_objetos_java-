public class valoresNegativosExpection extends Exception{
	public valoresNegativosExpection(String valor)
	{
		super("Valor de "+ valor +" negativo");
	}
}