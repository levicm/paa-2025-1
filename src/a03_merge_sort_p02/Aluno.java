package a03_merge_sort_p02;

public class Aluno implements Comparable<Aluno> {
    String nome;
    Float nota;

    public Aluno(String nome, Float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nota.compareTo(o.nota);
    }

}
