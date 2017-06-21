
public class UsaBicicleta {

	public static void main(String args[]) throws Exception
	{
		Bicicleta bike1 = new Bicicleta(1, 100, 24);
		
		bike1.printStates();
		//bike1.aumentarVelocidade(10);
		bike1.aplicarFreios(120);
	}
}