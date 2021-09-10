package lojaDeOculos;

public class Cliente extends Pessoa{
	
	private String email;
	
//Caso de sobrecarga do método construtor Cliente
	
	public Cliente(String nome, int registro, Telefone tel) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
	}
	public Cliente(String nome, int registro, Telefone tel, String email) {
		this.nome = nome;
		this.cpf = registro;
		this.numTel = tel;
		this.email = email;
	}

//toString() para printar para o usuário as informações do cliente
	
	public String toString() {
		return "Nome do aluno: " + nome + "\nCPF do aluno: "+ cpf +"\n"+ numTel;
	}

//gets e sets
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}