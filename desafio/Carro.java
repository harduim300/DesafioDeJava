package desafio;

public class Carro {
	//Definição de Variaveis 
	final String marca;
	final String modelo;
	final Integer ano;
	final Integer lugares;
	// A variavel quantidade é muito importante
	int quantidade = 0;
	
	//Array com todos objetos(Pessoas)
	Pessoa[] dentroCarro;
	
	public Carro(String marca,String modelo,Integer ano, Integer lugares) {
		//Inicialização de variaveis e da capacidade do carro
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.lugares = lugares;
		// Lembrando que não podemos definir o array sem dizer, quantos indices, eu terei
		this.dentroCarro = new Pessoa[this.lugares];
	}
	
	public void entrarNoCarro(Pessoa pessoa) {
		//Oberservar como a variavel quantidade, ajudar a mover o escopo
		this.dentroCarro[this.quantidade] = pessoa;
		System.out.println(pessoa.nome + " entrou no " + this.modelo);
		this.quantidade++;
	}
	public boolean sairDoCarro(Pessoa pessoa) {
		for(int i = 0; i < this.quantidade; i++) {
			if(this.dentroCarro[i].equals(pessoa)) {
				System.out.println(pessoa.nome + " saiu do " + this.modelo);
				// O delete não será completo se eu não ter null
				this.dentroCarro[i] = null;
				this.quantidade--;
				// Os returns true é importante pois ele cria uma quebra do metodo
				// Por exemplo um break apenas romperia o for
				// Mas não o  método sairDoCarro
				return true;
			}
		}
		System.out.println(pessoa.nome + " não se encontra dentro de " + this.modelo);
		return false;
	}
	public void quemEstaNoCarro() {
		System.out.println("------------------------------------------");
		System.out.println("Se encontram dentro do " + this.modelo );
		for(int i = 0; i < this.quantidade; i++) {
			System.out.println(this.dentroCarro[i].nome);
		}
		System.out.println("Ao total temos: " + this.quantidade + " pessoa(s) dentro do carro");
		System.out.println("------------------------------------------");
	}

}
