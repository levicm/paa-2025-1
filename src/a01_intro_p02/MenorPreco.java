package a01_intro_p02;

public class MenorPreco {

	public static void main(String[] args) {
		
		double precos[] = new double[5];
		
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 46000;
		precos[4] = 170000;
		
		int menor = 0;
		
		for (int atual = 0; atual < precos.length; atual++) {
			if (precos[atual] < precos[menor]) {
				menor = atual;
			}
		}

		System.out.println("Menor preco: " + precos[menor]);
	}

}
