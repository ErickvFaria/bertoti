package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NatureAssistant {

    private static final String MODEL = "qwen3:1.7b";

    public static String perguntar(String pergunta) {
        String resposta;
        try {
            String prompt = "Responda em português de forma curta e simples, " +
                    "como um professor de biologia explicando para uma criança: " + pergunta;

            ProcessBuilder pb = new ProcessBuilder("ollama", "run", MODEL);
            pb.redirectErrorStream(true); // captura erros no mesmo fluxo de saída
            Process process = pb.start();

            process.getOutputStream().write((prompt + "\n").getBytes("UTF-8"));
            process.getOutputStream().flush();
            process.getOutputStream().close();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream(), "UTF-8")
            );

            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            process.waitFor();
            resposta = output.toString().trim();

        } catch (IOException | InterruptedException e) {
            resposta = "Erro ao se comunicar com o Ollama: " + e.getMessage();
        }

        return resposta;
    }
}
