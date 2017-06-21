public class Celula {
	private Celula proxima;
	private Object elemento;

	public Celula (Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public Celula getProxima() {
		return proxima;
	}
	
}