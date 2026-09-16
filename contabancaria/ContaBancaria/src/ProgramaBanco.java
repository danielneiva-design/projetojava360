public class ProgramaBanco {
    void main() {
        ContaBancaria conta1 = new ContaBancaria("João", "12345", 1000.0);
        IO.println("Saldo inicial: " + conta1.getSaldo());
        conta1.depositar(500.0);
        IO.println("Depósito de R$ 500,00 recebido! \n Saldo atual: " + conta1.getSaldo());
        conta1.sacar(200.0);
        IO.println("Saldo após saque: " + conta1.getSaldo());

        conta1.sacar(5000);
        IO.println("Tentativa de saque de R$ 5000,00 falhou! \n Saldo atual: " + conta1.getSaldo());

        ContaBancaria conta2 = new ContaBancaria("Maria", "67890", 2000.0);
        IO.println("Saldo inicial: " + conta2.getSaldo());
        conta2.depositar(1000.0);
        IO.println("Depósito de R$ 1000,00 recebido! \n Saldo atual: " + conta2.getSaldo());
        conta2.sacar(500.0);
        IO.println("Saldo após saque: " + conta2.getSaldo());

        conta2.sacar(15000);
        IO.println("Tentativa de saque de R$ 15000,00 falhou! \n Saldo atual: " + conta2.getSaldo());
    }
}
