package lojaDeOculos;

public class Lente extends Produto{
	private String especificacao;
	private float grau;

//M�todo construtor
	
	public Lente(String marca, float preco, int cod, float grau, String especif) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.grau = grau;
		this.especificacao = especif;
	}
	
//toString() para printar para o usu�rio as informa��es da lente	
	
	public String toString() {
		return "Lente { Marca=" + marca + ", preco="+preco+", codigo do produto="+codigoProd
				+", grau="+grau+ " e especifica��o="+especificacao+" }";
	}

//gets e sets
	
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public float getGrau() {
		return grau;
	}
	public void setGrau(float grau) {
		this.grau = grau;
	}

}