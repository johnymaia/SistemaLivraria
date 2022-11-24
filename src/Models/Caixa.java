package Models;

public class Caixa {
    private double saldo;

    public Caixa(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor){
        saldo += valor;
    }

    public void removerSaldo(double valor){
        saldo -= valor;
    }
}
