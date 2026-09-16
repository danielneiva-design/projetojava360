public class ContaBancaria {
    String titular;
    String numeroConta;
    private double saldo;

    ContaBancaria(String novoTitular, String NovoNumeroConta, double novoSaldo) {
        titular = novoTitular;
        numeroConta = NovoNumeroConta;
        saldo = novoSaldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double novoSaldo) {
        saldo = novoSaldo;
        if (saldo < 0) {
            saldo = 0;
        }
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

}
