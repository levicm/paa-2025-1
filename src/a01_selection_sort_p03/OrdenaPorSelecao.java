package a01_selection_sort_p03;

public class OrdenaPorSelecao {

	public static void main(String[] args) {
		Produto carros[] = new Produto[5];
		carros[0] = new Carro("Lamborghini", 1000000, 500);
		carros[1] = new Carro("Jeep", 46000, 150);
		carros[2] = new Carro("Brasilia", 16000, 85);
		carros[3] = new Carro("Smart", 46000, 100);
		carros[4] = new Carro("Fusca", 17000, 90);
		
		imprimeVetor(carros);
		
		ordena(carros);

		imprimeVetor(carros);
	}

	private static void ordena(Comparable[] itens) {
		for (int i = 0; i < itens.length; i++) {
			System.out.println("posicao " + i + ": " + itens[i]);
			int menor = encontraMenor(itens, i, itens.length); 
			System.out.println("menor " + menor + ": " + itens[menor]);
			Comparable temp = itens[i];
			itens[i] = itens[menor];
			itens[menor] = temp;
		}
	}

	private static int encontraMenor(Comparable[] itens, int inicio, int fim) {
		int menor = inicio;
		for (int atual = inicio; atual < fim; atual++) {
			if (itens[atual].compareTo(itens[menor]) < 0) {
				menor = atual;
			}
		}
		return menor;
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
