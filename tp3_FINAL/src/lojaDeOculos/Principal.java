package lojaDeOculos;

public class Principal {

	public static void main(String[] args) {
		
		//Criação de objetos para teste 

		Telefone t1 = new Telefone(61, 40028922);
		System.out.println(t1.toString());

		Endereco e = new Endereco("DF", "Brasilia", "Vicente Pires", "Rua 8", 203, "Casa 12");
		System.out.println(e.toString());

		Telefone t2 = new Telefone(61,40028970);
		Cliente c = new Cliente("Gabriel", 123, t2);
		System.out.println(c.toString());
		System.out.println(c.getNumTel());

		Funcionario f = new Funcionario("Jorge", 12, "Salgadeiro");
		System.out.println(f.toString());

		Armacao a = new Armacao("RayBan", 500f, 12, "redondo", "ouro", "preto");
		System.out.println(a.toString());

		Lente l = new Lente("RayBan", 120f, 9, 1.2f, "lente com blue control");
		System.out.println(l.toString());

		OculosDeSol o = new OculosDeSol("Chilli Beans", 350f, 3, "pica", "plastico"
				,"marrom", "marrom tambem", true);
		System.out.println(o.toString());

		Dados d = new Dados();
	}

}
