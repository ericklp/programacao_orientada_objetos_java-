class Bicicleta{
	int cadencia = 0;
	int velocidade = 0;
	int marcha = 1;

	public Bicicleta(int cadencia, int velocidade, int marcha) {
		this.cadencia = cadencia;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}

	public int getCadencia() {
		return cadencia;
	}
	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	void mudarCadencia(int novoValor){
		cadencia = novoValor;
	}

	void mudarMarcha(int novoValor) throws Exception{
		if( novoValor > 24 )
			throw new valoresForaDoRangeExpection("marcha", 24);
		if(novoValor < 0)
			throw new valoresNegativosExpection("marcha");
		marcha = novoValor;
	}
	void aumentarVelocidade(int incremento) throws Exception{
		if(velocidade+incremento > 100)
			throw new valoresForaDoRangeExpection("velocidade", 100);
		if((velocidade+incremento) < 0)
			throw new valoresNegativosExpection("velocidade");

		velocidade = velocidade + incremento;
	}
	void aplicarFreios(int decremento)throws Exception{
		if((velocidade-decremento) < 0)
			throw new valoresNegativosExpection("velocidade");
		if((velocidade-decremento) > 100)
			throw new valoresForaDoRangeExpection("velocidade", 100);
		velocidade = velocidade - decremento;
	}
	void printStates(){
		System.out.println("cadencia="+cadencia+" velocidade="+velocidade+" marcha="+marcha);
	}
}