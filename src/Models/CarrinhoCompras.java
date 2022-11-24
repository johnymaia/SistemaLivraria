package Models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> itensCarrinho = new ArrayList<>();

    public void adicionarItem(Produto produto, Integer quantidade){
        Integer index = itensCarrinho.indexOf(produto);
        if(index != -1) {
            itensCarrinho.get(index).adicionarQuantidade(quantidade);
        }
        else{
            itensCarrinho.add(new Item(produto, quantidade));
        }
    }

    public void removerItem(Produto produto, Integer quantidade){
        Integer index = itensCarrinho.indexOf(produto);
        if(index != -1) {
            itensCarrinho.get(index).removerQuantidade(quantidade);
        }
        else{
            System.out.println("Produto não encontrado.");
        }
    }

    public double getValorTotal()
    {
        double total = 0;
        for (Item item: itensCarrinho) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return  total;
    }
}
