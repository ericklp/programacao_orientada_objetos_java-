
public class Contagem extends Thread{

	private int max;
	public Contagem(int max) {
		this.max = max;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public void run()
	{
		System.out.println("Inicio:"+getName());
		for (int i = 0 ; i<getMax() ; i++){
			System.out.println(i+"-"+getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
