package a01_intro_p05;

public class MenorPreco {

	public static void main(String[] args) {
		Carro carros[] = new Carro[5];
		carros[0] = new Carro("Lamborghini", 1000000);
		carros[1] = new Carro("Jeep", 46000);
		carros[2] = new Carro("Brasilia", 16000);
		carros[3] = new Carro("Smart", 46000);
		carros[4] = new Carro("Fusca", 170000);
		
		int menor = encontraMenor(carros);

		System.out.println("O carro mais barato é o: " + carros[menor].getNome() + " por " + carros[menor].getPreco());
	}

	private static int encontraMenor(Carro[] carros) {
		int menor = 0;
		for (int atual = 0; atual < carros.length; atual++) {
			if (carros[atual].getPreco() < carros[menor].getPreco()) {
				menor = atual;
			}
		}
		return menor;
	}

}
