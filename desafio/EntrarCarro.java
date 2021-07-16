package desafio;

public class EntrarCarro {

	public static void main(String[] args) {
		// Grande desafio meu kkkkk
		// Nesse desafio apenas mudei a ideia da entrada de pessoas
		// Ser considerada por numero (Ou seja, a ideia de contador)
		// Nesse desafio, procurei literalmente por pessoas dentro do carro
		// "Um objeto pessoa que tem nome, detro de um objeto carro"
		Carro carro1 = new Carro("Honda","CRV",2014,4);
		Pessoa pessoa1 = new Pessoa("Bruno");
		Pessoa pessoa2 = new Pessoa("Jorge");
		Pessoa pessoa3 = new Pessoa("Julia");
		Pessoa pessoa4 = new Pessoa("Armando");
		carro1.entrarNoCarro(pessoa1);
		carro1.entrarNoCarro(pessoa3);
		carro1.entrarNoCarro(pessoa4);
		carro1.quemEstaNoCarro();
		carro1.sairDoCarro(pessoa2);
		carro1.sairDoCarro(pessoa4);
		carro1.sairDoCarro(pessoa3);
		carro1.sairDoCarro(pessoa1);
		carro1.quemEstaNoCarro();
		Pessoa pessoa5 = new Pessoa("Breno");
		carro1.entrarNoCarro(pessoa5);
		carro1.quemEstaNoCarro();
	}
}
