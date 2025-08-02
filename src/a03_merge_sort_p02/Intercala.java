package a03_merge_sort_p02;

public class Intercala {

    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("André", 4f),
            new Aluno("Mariana", 5f),
            new Aluno("Carlos", 8.5f),
            new Aluno("Paulo", 9f),
            new Aluno("Jonas", 3f),
            new Aluno("Juliana", 6.7f),
            new Aluno("Gui", 7f),
            new Aluno("Lucia", 9.3f),
            new Aluno("Ana", 10f)
        };

        imprime(alunos);
        System.out.println("Intercalando apenas 1:");
        intercala(alunos, 0, 0, 1);
        imprime(alunos);
        System.out.println("Intercalando apenas 2 (ordenados):");
        intercala(alunos, 0, 1, 2);
        imprime(alunos);
        System.out.println("Intercalando blocos à frente, deixando 2 elementos intactos no inicio:");
        intercala(alunos, 2, 4, alunos.length);
        imprime(alunos);
        System.out.println("Intercalando apenas 2 elementos desordenados:");
        intercala(alunos, 1, 2, 3);
        imprime(alunos);
    }

    private static void intercala(Aluno[] alunos, int inicio, int meio, int fim) {
        Aluno[] resultado = new Aluno[fim - inicio];

        int atual1 = inicio;
        int atual2 = meio;
        int atual = 0;

        while (atual1 < meio && atual2 < fim) {
            if (alunos[atual1].compareTo(alunos[atual2]) <= 0) {
                resultado[atual++] = alunos[atual1++];
            } else {
                resultado[atual++] = alunos[atual2++];
            }
        }

        while (atual1 < meio) {
            resultado[atual++] = alunos[atual1++];
        }
        while (atual2 < fim) {
            resultado[atual++] = alunos[atual2++];
        }

        for (int i = 0; i < resultado.length; i++) {
            alunos[i + inicio] = resultado[i];
        }
    }

    static void imprime(Aluno[] alunos) {
        System.out.print("[");
        for (Aluno aluno : alunos) {
            if (aluno == null) {
                System.out.print(", null");
                continue;
            } 
            System.out.print(", " + aluno.nome + "(" + aluno.nota + ")");
        }
        System.out.println("]");
    }
    
}
