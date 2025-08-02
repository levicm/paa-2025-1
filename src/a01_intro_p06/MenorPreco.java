package a01_intro_p06;

public class MenorPreco {

	public static void main(String[] args) {
		Produto carros[] = new Produto[5];
		carros[0] = new Carro("Lamborghini", 1000000, 500);
		carros[1] = new Carro("Jeep", 46000, 150);
		carros[2] = new Carro("Brasilia", 16000, 85);
		carros[3] = new Carro("Smart", 46000, 100);
		carros[4] = new Carro("Fusca", 170000, 90);
		
		int menor = encontraMenor(carros);

		System.out.println("O carro mais barato é o: " + carros[menor]);
	}

	private static int encontraMenor(Produto[] carros) {
		int menor = 0;
		for (int atual = 0; atual < carros.length; atual++) {
			if (carros[atual].getPreco() < carros[menor].getPreco()) {
				menor = atual;
			}
		}
		return menor;
	}

}
