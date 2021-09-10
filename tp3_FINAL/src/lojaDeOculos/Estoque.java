package lojaDeOculos;

public class Estoque {

	private Armacao[] armacoes = new Armacao[40];
	private Lente[] lentes = new Lente[40];
	private OculosDeSol[] oculosSol = new OculosDeSol[40];
	private int qtdArmacoes;
	private int qtdLentes;
	private int qtdOculosSol;
	
//M�todo Construtor
	
	public Estoque(Armacao []armacoes, Lente []lentes, OculosDeSol []oculos, int qtdA, int qtdL, int qtdO) {
		this.armacoes = armacoes;
		this.lentes = lentes;
		this.oculosSol = oculos;
		this.qtdArmacoes = qtdA;
		this.qtdLentes = qtdL;
		this.qtdOculosSol = qtdO;
	}

//toString() para printar para o usu�rio as informa��es do estoque

	@Override
	public String toString() {
		return "Estoque [armacoes=" + armacoes + ", lentes=" + lentes + ", oculosSol=" + oculosSol + ", qtdArmacoes="
				+ qtdArmacoes + ", qtdLentes=" + qtdLentes + ", qtdOculosSol=" + qtdOculosSol + "]";
	}
	
//gets e sets
	
	public Armacao[] getArmacoes() {
		return armacoes;
	}
	public void setArmacoes(Armacao[] armacoes) {
		this.armacoes = armacoes;
	}
	public Lente[] getLentes() {
		return lentes;
	}
	public void setLentes(Lente[] lentes) {
		this.lentes = lentes;
	}
	public OculosDeSol[] getOculosSol() {
		return oculosSol;
	}
	public void setOculosSol(OculosDeSol[] oculosSol) {
		this.oculosSol = oculosSol;
	}
	public int getQtdArmacoes() {
		return qtdArmacoes;
	}
	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}
	public int getQtdLentes() {
		return qtdLentes;
	}
	public void setQtdLentes(int qtdLentes) {
		this.qtdLentes = qtdLentes;
	}
	public int getQtdOculosSol() {
		return qtdOculosSol;
	}
	public void setQtdOculosSol(int qtdOculosSol) {
		this.qtdOculosSol = qtdOculosSol;
	}

}