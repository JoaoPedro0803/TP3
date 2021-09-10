package lojaDeOculos;

public class Armacao extends Produto{
	
	private String formato;
	private String material;
	private String cor;
	
//M�todo Construtor
	
	public Armacao(String marca, float preco, int cod, String form, String material, String cor) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.cor = cor;
	}
	
//toString() para printar para o usu�rio as informa��es das arma��es
	
	public String toString() {
		return "Arma��o { Marca=" + marca + ", preco="+preco+", codigo do produto="+codigoProd
				+ ", formato="+ formato+", material="+material+ " e cor="+cor+" }"; 
	}
	
//gets e sets
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
