import br.com.screematch.calculos.CalculadoraDeTempo;
import br.com.screematch.calculos.FiltroRecomendacao;
import br.com.screematch.model.Episodio;
import br.com.screematch.model.Filme;
import br.com.screematch.model.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2018);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme coringa = new Filme();

        coringa.setNome("Coringa");
        coringa.setAnoDeLancamento(2021);
        coringa.setDuracaoEmMinutos(210);
        System.out.println("Duração em minutos: " + coringa.getDuracaoEmMinutos());
        coringa.exibeFichaTecnica();

        coringa.avalia(8);
        coringa.avalia(2);
        coringa.avalia(8);
        System.out.println("Total de avaliações: " + coringa.getTotalDeAvaliacoes());
        System.out.println(coringa.pegaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(coringa);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);
        filtro.filtra(coringa);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(400);
        filtro.filtra(episodio);





    }
}