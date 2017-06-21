
public class Sistema {
	
	public static void main(String args[])
	{
		Gerente g1 = new Gerente("John", "12312", 1000, true);
		
		g1.bonifica();
		System.out.println("g1"+g1);
		
		g1.demite();
		System.out.println("g1"+g1);

		return;
	}
}
