package a01_selection_sort_p02;

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

	private static void ordena(Produto[] carros) {
		for (int i = 0; i < carros.length; i++) {
			System.out.println("posicao " + i + ": " + carros[i]);
			int menor = encontraMenor(carros, i, carros.length); 
			System.out.println("menor " + menor + ": " + carros[menor]);
			Produto temp = carros[i];
			carros[i] = carros[menor];
			carros[menor] = temp;
		}
	}

	private static int encontraMenor(Produto[] carros, int inicio, int fim) {
		int menor = inicio;
		for (int atual = inicio; atual < fim; atual++) {
			if (carros[atual].getPreco() < carros[menor].getPreco()) {
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
