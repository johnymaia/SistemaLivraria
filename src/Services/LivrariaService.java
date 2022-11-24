package Services;

import Models.Caixa;
import Models.CarrinhoCompras;
import Models.Estoque;

public class LivrariaService {
    private Caixa caixa;
    private Estoque estoque;
    private CarrinhoCompras carrinhoCompras;

    public void verSaldoCaixa(){
        System.out.println(caixa.getSaldo());
    }

}
