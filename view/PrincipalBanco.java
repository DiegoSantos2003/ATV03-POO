package view;

public class PrincipalBanco {
    public static void main(String[] args) {
 
        ContaPoupanca poupanca = new ContaPoupanca("Cliente Poupança", 123456, 1000.0f, 10);
        ContaEspecial especial = new ContaEspecial("Cliente Especial", 789012, 2000.0f, 500.0f);

        poupanca.sacar(200.0f);
        especial.sacar(300.0f);

        poupanca.sacar(1500.0f);
        especial.sacar(3000.0f);

        especial.sacar(400.0f);
        especial.sacar(2000.0f);

        poupanca.depositar(500.0f);
        especial.depositar(1000.0f);

        poupanca.calcularNovoSaldo(0.5f); 

        System.out.println("Dados da Conta Poupança: Cliente - " + poupanca.getCliente() + ", Número da Conta - "
                + poupanca.getNumConta() + ", Saldo - " + poupanca.getSaldo());
        System.out.println("Dados da Conta Especial: Cliente - " + especial.getCliente() + ", Número da Conta - "
                + especial.getNumConta() + ", Saldo - " + especial.getSaldo());
    }
}
