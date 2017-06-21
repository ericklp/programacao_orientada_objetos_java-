class inverte
{
	public static void main (String args[])
	{
		String arg = args[0];
		arg = new StringBuilder(arg).reverse().toString();
		System.out.println(arg);
	}
}
