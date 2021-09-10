package lojaDeOculos;

public class Telefone {
	private int ddd;
	private int numero;

	public Telefone(int ddd, int num) {
		
	this.ddd = ddd;
	this.numero = num;
	}
	
	public Telefone() {
		
	}

//toString() para printar para o usu�rio as informa��es do telefone	
	@Override
	public String toString() {
		return "Telefone: (" + ddd + ") " + numero;
	}
	
//gets e sets
	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}