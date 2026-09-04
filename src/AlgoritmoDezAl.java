package src;

public class AlgoritmoDezAl {
    void main() {
        //Calcular média aritmética
        int numero1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(IO.readln("Agora digite o segundo número: "));
        int soma = numero1 + numero2;
        double media = (double) soma / 2;
        IO.println("A média aritmética dos números " + numero1 + " e " + numero2 + " é: " + media);
    }
}
