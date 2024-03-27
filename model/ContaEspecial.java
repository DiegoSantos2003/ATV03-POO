package model;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public void sacar(float valor) {
        float limiteUtilizado = getSaldo() - valor;
        if (limiteUtilizado >= -limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Limite de saque excedido.");
        }
    }
}