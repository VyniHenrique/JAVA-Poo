package br.com.aplicativo.principal;

import br.com.aplicativo.caracteristicas.Audio;
import br.com.aplicativo.caracteristicas.Musica;
import br.com.aplicativo.caracteristicas.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        //atribuindo os atributos do objeto
        minhaMusica.setNome("Levanta e anda");
        minhaMusica.setArtista("Emicida");
        minhaMusica.setDuracaoEmMinutos(2.3);
        minhaMusica.setAnoDeLancamento(2014);
        minhaMusica.setGenero("Rap");
        minhaMusica.setAlbum("Levanta e anda");

        //incrementando os valores de reproduções
        for (int i = 0; i < 1000; i++) {
            minhaMusica.TotalDeReproducoes();
        }
        //incrementando os valores de curtidas
        for (int i = 0; i < 50; i++) {
            minhaMusica.TotalDeCurtidas();
        }

        //testando os métodos da classe Musica
        System.out.println("\nNome da musica: " + minhaMusica.getNome());
        System.out.println("Nome do artista: " + minhaMusica.getArtista());
        System.out.println("Duracao da musica: " + minhaMusica.getDuracaoEmMinutos() + " minutos");
        System.out.println("Ano de lancamento: " + minhaMusica.getAnoDeLancamento());
        System.out.println("Genero da musica: " + minhaMusica.getGenero());
        System.out.println("Album da musica: " + minhaMusica.getAlbum());
        System.out.println("Total de reproducoes: " + minhaMusica.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + minhaMusica.getTotalCurtidas());

        Podcast meuPodcast = new Podcast();

        meuPodcast.setNome("TalkDev");
        meuPodcast.setApresentador("Vynicius");
        meuPodcast.setDescricao("Um podcast feito para devs");

        System.out.println("\n\nNome do podcast: " + meuPodcast.getNome());
        System.out.println("Nome do apresentador " + meuPodcast.getApresentador());
        System.out.println("Descricao do podcast: " + meuPodcast.getDescricao());
    }
}