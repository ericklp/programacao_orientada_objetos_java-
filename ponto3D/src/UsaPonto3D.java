public class UsaPonto3D {

	public static void main(String args[])
	{
		Ponto3D p1 = new Ponto3D(20, 20, 20, 1, "azul");
		Ponto3D p2 = new Ponto3D(30, 30, 30, 1, "vermelho");
		Ponto3D p3 = new Ponto3D(1, 1, 1, 1, "vermelho");
		
		System.out.println("Distância p1 a p2: " + p1.calculaDistancia(p2));
		System.out.println("Distância p1 a p3: " + p1.calculaDistancia(p3));
		
	}
}