package EngenhariaSoftware.exercicio_5;

public class Tempo {
    private int anoAtual;
    private int decada;
    private String eventoHistorico;

    public Tempo(int anoAtual, int decada, String eventoHistorico) {
        this.anoAtual = anoAtual;
        this.decada = decada;
        this.eventoHistorico = eventoHistorico;
    }

    public int getAnoAtual() { return anoAtual; }
    public int getDecada() { return decada; }
    public String getEventoHistorico() { return eventoHistorico; }

    @Override
    public String toString() {
        return "Ano: " + anoAtual + " | Década: " + decada + " | Evento: " + eventoHistorico;
    }
}
