class velocidade
{
	public static void main (String args[])
	{
		float dist, tempo, res;

		dist	= Integer.parseInt(args[0]);
		tempo	= Integer.parseInt(args[1]);

		res = dist / tempo;

		System.out.printf("A velocidade média foi de %.2f km/h \n", res);
	}
}