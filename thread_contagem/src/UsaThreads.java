
public class UsaThreads {

	public static void main(String arg[])
	{
		System.out.println("Inicio main");
		Contagem c1 = new Contagem(10);
		Contagem c2 = new Contagem(20);
		
		c1.start();
		c2.start();
		
		System.out.println("fim main");
	}
}
