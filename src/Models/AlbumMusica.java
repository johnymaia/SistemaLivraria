package Models;

import java.util.ArrayList;
import java.util.List;

public class AlbumMusica extends ProdutoComGenero{
    private List<String> musicosOuBandas = new ArrayList<>();
    private List<String> selos = new ArrayList<>();

    public AlbumMusica(String nome, Integer id, Double preco, List<String> generos, List<String> musicosOuBandas, List<String> selos) {
        super(nome, id, preco, generos);
        this.musicosOuBandas = musicosOuBandas;
        this.selos = selos;
    }

    public List<String> getMusicosOuBandas() {
        return musicosOuBandas;
    }

    public void addMusicosOuBandas(String musicoOuBanda) {
        this.musicosOuBandas.add(musicoOuBanda);
    }

    public List<String> getSelos() {
        return selos;
    }

    public void addSelos(String selo) {
        this.selos.add(selo);
    }
}
