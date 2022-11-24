package Models;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Item> itensEstoque = new ArrayList<>();

    public void adicionarItemAoEstoque(Produto produto, Integer quantidade){
        Integer index = itensEstoque.indexOf(produto);
        if(index != -1) {
            itensEstoque.get(index).adicionarQuantidade(quantidade);
        }
        else{
            itensEstoque.add(new Item(produto, quantidade));
        }
    }

    public void removerItemEstoque(Produto produto, Integer quantidade){
        Integer index = itensEstoque.indexOf(produto);
        if(index != -1) {
            itensEstoque.get(index).removerQuantidade(quantidade);
        }
        else{
            System.out.println("Produto não encontrado.");
        }
    }
}
