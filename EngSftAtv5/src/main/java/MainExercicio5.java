package EngenhariaSoftware.exercicio_5;

import java.util.Scanner;

public class MainExercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CADASTRO DE HUMANO =====");
        System.out.print("Nome: ");
        String nomeH = sc.nextLine();

        System.out.print("Idade: ");
        int idadeH = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Roupa: ");
        String roupa = sc.nextLine();

        System.out.print("Ano atual: ");
        int ano = sc.nextInt();

        System.out.print("Década: ");
        int decada = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Evento histórico: ");
        String evento = sc.nextLine();

        Tempo tempo = new Tempo(ano, decada, evento);
        Humano humano = new Humano(nomeH, idadeH, roupa, tempo);

        System.out.println("\n===== CADASTRO DE OVELHA =====");
        System.out.print("Nome: ");
        String nomeO = sc.nextLine();

        System.out.print("Idade: ");
        int idadeO = sc.nextInt();

        System.out.print("Quantidade de lã (kg): ");
        double lana = sc.nextDouble();

        Ovelha ovelha = new Ovelha(nomeO, idadeO, lana, tempo);
        humano.adicionarOvelha(ovelha);

        System.out.println("\n===== RESULTADO =====");
        System.out.println(humano);
        humano.listarOvelhas();

        sc.close();
    }
}
