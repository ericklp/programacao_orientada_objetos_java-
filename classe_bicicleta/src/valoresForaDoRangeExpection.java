public class valoresForaDoRangeExpection extends Exception{
	public valoresForaDoRangeExpection(String valor, int max)
	{
		super("Valor de "+ valor +" não pode ser superior a " + max);
	}
}