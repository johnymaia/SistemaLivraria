package Models;

import java.util.List;

public class Jogo extends ProdutoComGenero{
    private String distribuidora;
    private String estudio;

    public Jogo(String nome, Integer id, Double preco, List<String> generos, String distribuidora, String estudio) {
        super(nome, id, preco, generos);
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
