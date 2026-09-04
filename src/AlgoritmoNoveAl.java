package src;

public class AlgoritmoNoveAl {
    void main() {
        //Ler um numero real e imprimir a terça parte deste numero
        IO.println("Vamos calcular a terça parte de um número real: \n");
        double numero = Double.parseDouble(IO.readln("Digite um número: "));
        double tercaParte = numero / 3;
        IO.println("A terça parte do número " + numero + " é: " + tercaParte);
    }
}
