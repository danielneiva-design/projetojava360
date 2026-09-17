public class ProgramaBanco {
    void main() {
        ContaBancaria conta1 = new ContaBancaria("João", "12345", 1000.0);
        IO.println("Bem-vindo ao Banco!");
        
        IO.println("Titular: " + conta1.getNomeTitular());
        IO.println("Número da conta: " + conta1.getNumeroConta());
        IO.println("Saldo inicial: " + conta1.getSaldo());
        double valorDeposito = Double.parseDouble(IO.readln("Qual valor você deseja depositar na conta de " + conta1.getNomeTitular() + "?"));
        conta1.depositar(valorDeposito);
        IO.println("Depósito de R$ " + valorDeposito + " recebido! \n Saldo atual: " + conta1.getSaldo());
        IO.println("Qual valor você deseja sacar da conta de " + conta1.getNomeTitular() + "?");
        double valorSaque = Double.parseDouble(IO.readln("Qual valor você deseja sacar da conta de " + conta1.getNomeTitular() + "?"));
        conta1.sacar(valorSaque);
        IO.println("Saldo após saque: " + conta1.getSaldo());
        double valorSaque2 = Double.parseDouble(IO.readln("Deseja sacar mais algum valor? Digite abaixo " + conta1.getNomeTitular() + ":"));
        conta1.sacar(valorSaque2);
        IO.println("Saldo após saque: " + conta1.getSaldo());
    }
}
