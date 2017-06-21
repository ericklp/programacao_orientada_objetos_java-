

public class Ponto3D 
{
	private double x;
	private double y;
	private double z;
	private double intensidade;
	private String cor;

	public Ponto3D(double x, double y, double z, double intensidade, String cor) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.intensidade = intensidade;
		this.cor = cor;
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(double intensidade) {
		this.intensidade = intensidade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public double calculaDistancia(Ponto3D p)
	{
		double xa = p.getX();
		double ya = p.getY();
		double za = p.getZ();

		double xb = this.getX();
		double yb = this.getY();
		double zb = this.getZ();

		double x = Math.pow((xa-xb), 2);
		double y = Math.pow((ya-yb), 2);
		double z = Math.pow((za-zb), 2);

		double dist = Math.sqrt(x+y+z);

		return dist;
	}

	public static void main(String args[])
	{
		System.out.println("TESTE");
	}
}
