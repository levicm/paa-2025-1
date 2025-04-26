package a01_intro_p01;

public class MenorPreco {

	public static void main(String[] args) {
		
		double precos[] = new double[5];
		
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 46000;
		precos[4] = 170000;
		
		double menor = precos[0];
		
		for (int atual = 0; atual < precos.length; atual++) {
			if (precos[atual] < menor) {
				menor = precos[atual];
			}
		}

		System.out.println("Menor preco: " + menor);

	}

}
