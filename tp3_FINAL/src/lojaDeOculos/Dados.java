package lojaDeOculos;

public class Dados {
	
	private Cliente[] clientes = new Cliente[40];
	private int qtdClientes = 0;
	private Funcionario[] funcs = new Funcionario[40];
	private int qtdFuncs = 0;
	private Armacao[] armacoes = new Armacao[40];
	private int qtdArmacoes = 0;
	private Telefone[] tels = new Telefone[40];
	private int qtdTels = 0;
	private Endereco[] enderecos = new Endereco[40];
	private int qtdEnderecos = 0;
	private Lente[] lentes = new Lente[40];
	private int qtdLentes = 0;
	private OculosDeSol[] oculos = new OculosDeSol[40];
	private int qtdOculos = 0;
	private Estoque[] estoques = new Estoque[40];
	private int qtdEstoques = 0;
	private Venda[] vendas = new Venda[40];
	private int qtdVendas = 0;
	
	public void preCadastro() {
		
			for(int i = 0; i < 10 ; i++ ) {
				funcs[i] = new Funcionario("Funcionario"+i, (i+2)*12345, "Funcao"+i);
				armacoes[i] = new Armacao("Marca"+i,(i/2)*200,(i+3)+120,"Formato"+i,"Material"+i,"Cor"+i);
				tels[i] = new Telefone((i+1)*100, (i+1)*1000000);
				clientes[i] = new Cliente("Cliente"+i,i*(111111111),tels[i]);
				enderecos[i] = new Endereco("Estado"+i,"Cidade"+i,"Bairro"+i,"Quadra"+i, i,"Complemento"+i);
				lentes[i] = new Lente("Marca"+i,(i/2)*50f,i*123,(i/5),"Especificação"+i);
				oculos[i] = new OculosDeSol("Marca"+i,(i/4)*400,i*45,"Formato"+i,"Material"+i,
						"Cor da lente"+i,"Cor da armação"+i,true);
				estoques[i] = new Estoque(armacoes,lentes,oculos,(i-1),(i+1),i);
				vendas[i] = new Venda(estoques,clientes,i,"Forma de pagamento"+i,(i+4)*785);
			}
		
		qtdClientes = 10;
		qtdFuncs = 10;
		qtdArmacoes = 10;
		qtdTels = 10;
		qtdEnderecos = 10;
		qtdLentes = 10;
		qtdOculos = 10;
		qtdEstoques = 10;
		qtdVendas = 10;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}

	public Funcionario[] getFuncs() {
		return funcs;
	}

	public void setFuncs(Funcionario[] funcs) {
		this.funcs = funcs;
	}

	public int getQtdFuncs() {
		return qtdFuncs;
	}

	public void setQtdFuncs(int qtdFuncs) {
		this.qtdFuncs = qtdFuncs;
	}

	public Armacao[] getArmacoes() {
		return armacoes;
	}

	public void setArmacoes(Armacao[] armacoes) {
		this.armacoes = armacoes;
	}

	public int getQtdArmacoes() {
		return qtdArmacoes;
	}

	public void setQtdArmacoes(int qtdArmacoes) {
		this.qtdArmacoes = qtdArmacoes;
	}

	public Telefone[] getTels() {
		return tels;
	}

	public void setTels(Telefone[] tels) {
		this.tels = tels;
	}

	public int getQtdTels() {
		return qtdTels;
	}

	public void setQtdTels(int qtdTels) {
		this.qtdTels = qtdTels;
	}

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public int getQtdEnderecos() {
		return qtdEnderecos;
	}

	public void setQtdEnderecos(int qtdEnderecos) {
		this.qtdEnderecos = qtdEnderecos;
	}

	public Lente[] getLentes() {
		return lentes;
	}

	public void setLentes(Lente[] lentes) {
		this.lentes = lentes;
	}

	public int getQtdLentes() {
		return qtdLentes;
	}

	public void setQtdLentes(int qtdLentes) {
		this.qtdLentes = qtdLentes;
	}

	public OculosDeSol[] getOculos() {
		return oculos;
	}

	public void setOculos(OculosDeSol[] oculos) {
		this.oculos = oculos;
	}

	public int getQtdOculos() {
		return qtdOculos;
	}

	public void setQtdOculos(int qtdOculos) {
		this.qtdOculos = qtdOculos;
	}

	public Estoque[] getEstoques() {
		return estoques;
	}

	public void setEstoques(Estoque[] estoques) {
		this.estoques = estoques;
	}

	public int getQtdEstoques() {
		return qtdEstoques;
	}

	public void setQtdEstoques(int qtdEstoques) {
		this.qtdEstoques = qtdEstoques;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
			
}
