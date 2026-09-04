package src;

public class AlgoritmoQuatroDois {
    //Qual é o mês atual no novo switch?
    void main() {
        int mes = Integer.parseInt(IO.readln("Digite o mês atual (1 a 12): "));
        IO.println("O mês atual é: " + mes);
        switch (mes) {
            case 1 -> IO.println("Janeiro");
            case 2 -> IO.println("Fevereiro");
            case 3 -> IO.println("Março");
            case 4 -> IO.println("Abril");
            case 5 -> IO.println("Maio");
            case 6 -> IO.println("Junho");
            case 7 -> IO.println("Julho");
            case 8 -> IO.println("Agosto");
            case 9 -> IO.println("Setembro");
            case 10 -> IO.println("Outubro");
            case 11 -> IO.println("Novembro");
            case 12 -> IO.println("Dezembro");
            default -> IO.println("Mês inválido!");
        }
    }
}
