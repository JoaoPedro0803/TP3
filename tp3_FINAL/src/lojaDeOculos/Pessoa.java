package lojaDeOculos;

public abstract class Pessoa {

	protected Endereco residencia;
	protected Telefone numTel;
	protected String nome;
	protected int numID;
	protected int cpf;
	
//gets e sets
	public Endereco getResidencia() {
		return residencia;
	}
	
	public void setResidencia(Endereco residencia) {
		this.residencia = residencia;
	}
	
	public Telefone getNumTel() {
		return numTel;
	}
	
	public void setNumTel(Telefone numTel) {
		this.numTel = numTel;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumID() {
		return numID;
	}
	
	public void setNumID(int numID) {
		this.numID = numID;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
