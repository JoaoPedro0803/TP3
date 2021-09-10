package lojaDeOculos;

import java.util.Arrays;
import java.util.Date;

public class Venda {

	private Estoque[] estoque;
	private Cliente[] cliente;
	private Funcionario[] funcionario;
	private int qtdVendida;
	private String formaPag;
	private Date dataVenda;
	private int codVenda;
	
//Caso de sobrecarga do método construtor Venda
	public Venda(Estoque[] estoque, Cliente[] cliente, Funcionario[]funcionario, int qtd, String form, Date data, int cod) {
		this.estoque = estoque;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.qtdVendida = qtd;
		this.formaPag = form;
		this.dataVenda = data;
		this.codVenda = cod;
	}
	
	public Venda(Estoque[] estoque, Cliente[] cliente, int qtd, String form, int cod) {
		this.estoque = estoque;
		this.cliente = cliente;
		this.qtdVendida = qtd;
		this.formaPag = form;
		this.codVenda = cod;
	}
	
//toString() para printar para o usuário as informações da venda
	
	@Override
	public String toString() {
		return "Venda [estoque=" + Arrays.toString(estoque) + ", cliente=" + Arrays.toString(cliente) + ", funcionario="
				+ Arrays.toString(funcionario) + ", qtdVendida=" + qtdVendida + ", formaPag=" + formaPag
				+ ", dataVenda=" + dataVenda + ", codVenda=" + codVenda + "]";
	}
	
//gets e sets
	
	public int getQtdVendida() {
		return qtdVendida;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public int getCodVenda() {
		return codVenda;
	}

	public void setCodVenda(int codVenda) {
		this.codVenda = codVenda;
	}

	public Estoque[] getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque[] estoque) {
		this.estoque = estoque;
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

}
