package a01_intro_p04;

public class MenorPreco {

	public static void main(String[] args) {
		double precos[] = new double[5];
		String nomes[] = new String[5];
		
		nomes[0] = "Lamborghini";
		precos[0] = 1000000;
		nomes[1] = "Jeep";
		precos[1] = 46000;
		nomes[2] = "Brasilia";
		precos[2] = 16000;
		nomes[3] = "Smart";
		precos[3] = 46000;
		nomes[4] = "Fusca";
		precos[4] = 170000;
		
		int menor = encontraMenor(precos);

		System.out.println("O carro mais barato é o: " + nomes[menor] + " por " + precos[menor]);
	}

	private static int encontraMenor(double[] precos) {
		int menor = 0;
		for (int atual = 0; atual < precos.length; atual++) {
			if (precos[atual] < precos[menor]) {
				menor = atual;
			}
		}
		return menor;
	}

}
