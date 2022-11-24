package Models;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComGenero extends Produto{
    private List<String> generos = new ArrayList<>();

    public ProdutoComGenero(String nome, Integer id, Double preco, List<String> generos) {
        super(nome, id, preco);
        this.generos = generos;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos.add(generos);
    }
}
