package a02_insertion_sort_p01;

public class OrdenaPorInsercao {

	public static void main(String[] args) {
		Produto produtos[] = new Produto[5];
		produtos[0] = new Produto("Lamborghini", 1000000);
		produtos[1] = new Produto("Jeep", 46000);
		produtos[2] = new Produto("Brasilia", 16000);
		produtos[3] = new Produto("Smart", 46000);
		produtos[4] = new Produto("Fusca", 17000);
		
		imprimeVetor(produtos);
		
		ordena(produtos);

		imprimeVetor(produtos);
	}

	private static void ordena(Comparable[] itens) {
		for (int atual = 0; atual < itens.length; atual++) {
			int analise = atual;
			// Laço de comparação do elemento analisado com o anterior, até o início da estrutura
			while (analise > 0) {
				if (itens[analise].compareTo(itens[analise - 1]) < 0) {
					// mover pra trás
					Comparable temp = itens[analise];
					itens[analise] = itens[analise - 1];
					itens[analise - 1] = temp;
				}
				analise--;
			}
		}
	}

	private static void imprimeVetor(Object[] vetor) {
		System.out.print("[");
		for (int i = 0; i < vetor.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(vetor[i]);
		}
		System.out.println("]");
	}
}
