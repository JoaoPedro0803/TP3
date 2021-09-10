package lojaDeOculos;

public class Endereco {

	private String estado;
	private String cidade;
	private String bairro;
	private String quadra;
	private int  numero;
	private String complemento;
	
//M�todo Construtor
	
	public Endereco(String est, String cid, String bair, String quad, int numero, String comp) {
		this.estado = est;
		this.cidade = cid;
		this.bairro = bair;
		this.quadra = quad;
		this.numero = numero;
		this.complemento = comp;
	}

//toString() para printar para o usu�rio as informa��es do endere�o
	@Override
	public String toString() {
		return "Endereco: " + cidade + " - " + estado +", bairro=" + bairro + ", quadra=" + quadra
				+ ", numero=" + numero + ", complemento=" + complemento;
	}
	
//gets e sets
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getQuadra() {
		return quadra;
	}

	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
}
