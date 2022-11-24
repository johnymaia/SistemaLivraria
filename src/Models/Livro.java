package Models;

import java.util.List;

public class Livro extends ProdutoComGenero{

    private String escritor;
    private String editora;

    public Livro(String nome, Integer id, Double preco, List<String> generos, String escritor, String editora) {
        super(nome, id, preco, generos);
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
