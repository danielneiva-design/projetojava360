package src;

public class AlgoritmoQuatroAl {
    void main() {
        int diaDaSemana = 3;
        String nomeDoDia;

        switch (diaDaSemana) {
            case 2 -> nomeDoDia = "Segunda-feira";
            case 3 -> nomeDoDia = "Terça-feira";
            case 4 -> nomeDoDia = "Quarta-feira";
            default -> nomeDoDia = "Dia inválido!";
        }
    
        IO.println("O dia da semana é: " + nomeDoDia);
    }
}
