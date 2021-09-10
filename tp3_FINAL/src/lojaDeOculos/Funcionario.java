package lojaDeOculos;
import java.util.Date;

public class Funcionario extends Pessoa{

	private Date dataNasc; 
	private int matricula;
	private Date dataIngresso;
	private float salario;
	private String cargo;
	
//Método Construtor 
	
	public Funcionario(String nome, int matricula, String funcao) {
		this.nome = nome;
		this.matricula = matricula;
		this.cargo = funcao;
	}
	
//toString() para printar para o usuário as informações do funcionário
	
	public String toString() {
		return "Dados do funcionário:\nNome: " + this.nome + ", matrícula: " + matricula
				+ " e cargo: " + cargo;
	}
	
//gets e sets
	
	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Date getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(Date dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}