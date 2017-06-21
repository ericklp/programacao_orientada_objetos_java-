public class Pilha<T> {
	private Celula primeira;
	private int totalDeElementos;

	public void empilha(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		this.totalDeElementos++;
	}

	public void desempilha() {
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
	}

	public String toString() {
		String str = "[";
		Celula atual = primeira;

		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			str = str + atual.getElemento();
			str += ",";
			atual = atual.getProxima();
		}
		
		str = str + atual.getElemento();
		return str += "]";
	}
}