package Models;

import java.util.ArrayList;
import java.util.List;

public class Filme extends ProdutoComGenero {
    private List<String> diretores = new ArrayList<>();
    private List<String> produtores = new ArrayList<>();

    public Filme(String nome, Integer id, Double preco, List<String> generos, List<String> diretores, List<String> produtores) {
        super(nome, id, preco, generos);
        this.diretores = diretores;
        this.produtores = produtores;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretor) {
        this.diretores.add(diretor);
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtor) {
        this.produtores.add(produtor);
    }
}
