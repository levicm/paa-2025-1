package a01_selection_sort_p01;

public class Carro extends Produto {

	private int potencia;

	public Carro(String nome, double preco) {
		super(nome, preco);
	}

	public Carro(String nome, double preco, int potencia) {
		super(nome, preco);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	@Override
	public String toString() {
		return this.getNome() + " (" + this.potencia + " cavalos de potência): R$ " + this.getPreco();
	}
}
