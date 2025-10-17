package EngenhariaSoftware.exercicio_5;

public class Ovelha {
    private String nome;
    private int idade;
    private double quantidadeLana;
    private Tempo tempo;

    public Ovelha(String nome, int idade, double quantidadeLana, Tempo tempo) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeLana = quantidadeLana;
        this.tempo = tempo;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getQuantidadeLana() { return quantidadeLana; }
    public Tempo getTempo() { return tempo; }

    @Override
    public String toString() {
        return "Ovelha: " + nome + " | Idade: " + idade + " | Lã: " + quantidadeLana + "kg | " + tempo;
    }
}
