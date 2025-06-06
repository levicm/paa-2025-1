package a01_selection_sort_p03;

public class Produto implements Comparable<Produto> {

	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produto o) {
		if (this.preco > o.preco) {
			return 1;
		} else if (this.preco < o.preco) {
			return -1;
		} else {
			return 0;
		}
	}

}
