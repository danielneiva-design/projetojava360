package src;

public class AlgoritmoDozeAl {
    void main() {
        IO.println("Digite o número e descubra se ele é par ou ímpar: ");
        int numero = Integer.parseInt(IO.readln());
        double resto = numero % 2;
        if (numero % 2 == 0) {
            IO.println("O número " + numero + " é par.");
        } else {
            IO.println("O número " + numero + " é ímpar.");
            IO.println("O resto da divisão é: " + resto);
        }
    }

}
