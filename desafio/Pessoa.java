package desafio;

public class Pessoa {

	final String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa() {
		this.nome = null;
	}
	//Acredito que esse construtor seja necessário
	//Para o array vazio de carro não exigir nome
}
