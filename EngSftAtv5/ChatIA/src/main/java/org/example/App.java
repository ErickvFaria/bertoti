package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🌱 Bem-vindo ao Nature Assistant!");
        System.out.println("Faça uma pergunta sobre natureza (ou digite 'sair' para encerrar).");

        while (true) {
            System.out.print("\nVocê: ");
            String pergunta = scanner.nextLine();

            if (pergunta.equalsIgnoreCase("sair")) {
                System.out.println("Até logo! 🌎");
                break;
            }

            String resposta = NatureAssistant.perguntar(pergunta);
            System.out.println("Assistente: " + resposta);
        }

        scanner.close();
    }
}
