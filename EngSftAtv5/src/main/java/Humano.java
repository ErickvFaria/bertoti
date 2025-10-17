package EngenhariaSoftware.exercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Humano {
    private String nome;
    private int idade;
    private String roupa;
    private Tempo tempo;
    private List<Ovelha> ovelhas = new ArrayList<>();

    public Humano(String nome, int idade, String roupa, Tempo tempo) {
        this.nome = nome;
        this.idade = idade;
        this.roupa = roupa;
        this.tempo = tempo;
    }

    public void adicionarOvelha(Ovelha o) {
        ovelhas.add(o);
    }

    public void listarOvelhas() {
        if (ovelhas.isEmpty()) {
            System.out.println(nome + " não possui ovelhas.");
        } else {
            System.out.println("\nOvelhas de " + nome + ":");
            for (Ovelha o : ovelhas) {
                System.out.println(" - " + o);
            }
        }
    }

    @Override
    public String toString() {
        return "Humano: " + nome + " | Idade: " + idade + " | Roupa: " + roupa + " | " + tempo;
    }
}
