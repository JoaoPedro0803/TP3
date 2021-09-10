package lojaDeOculos;

public class OculosDeSol extends Produto{

	private String formato;
	private String material;
	private String corDaLente;
	private String corDaArmacao;
	private boolean polarizada;
	
//Método Construtor
	
	public OculosDeSol(String marca, float preco, int cod, String form, String material,
			String corL, String corA, boolean pol) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.formato = form;
		this.material = material;
		this.corDaLente = corL;
		this.corDaArmacao = corA;
		this.polarizada = pol;
	}
	
	//toString() para printar para o usuário as informações dos óculos de sol
	
	public String toString() {
		return "Óculos de Sol { Marca="+marca+", preco="+preco+", codigo do produto="+codigoProd+
				", formato="+ formato+", material="+material+ ", cor da lente="+corDaLente+
				", cor da armação="+ corDaArmacao + " e lente polarizada="+polarizada+"}";
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

	public String getCorDaLente() {
		return corDaLente;
	}

	public void setCorDaLente(String corDaLente) {
		this.corDaLente = corDaLente;
	}

	public String getCorDaArmacao() {
		return corDaArmacao;
	}

	public void setCorDaArmacao(String corDaArmacao) {
		this.corDaArmacao = corDaArmacao;
	}

	public boolean getPolarizada() {
		return polarizada;
	}

	public void setPolarizada(boolean polarizada) {
		this.polarizada = polarizada;
	}

}