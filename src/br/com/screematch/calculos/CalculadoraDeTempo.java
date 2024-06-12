package br.com.screematch.calculos;

import br.com.screematch.model.Filme;
import br.com.screematch.model.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){

        tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
