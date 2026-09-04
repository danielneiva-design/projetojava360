package src;

public class AlgoritmoSeteAl {
    void main() {
        //Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá aparecer a mensagem: Soma.
        IO.println("Digite dois números de 1 a 100: \n");
        int numero1 = Integer.parseInt(IO.readln("Digite o primeiro número inteiro: "));
        int numero2 = Integer.parseInt(IO.readln("Digite o segundo número inteiro: "));
        int soma = numero1 + numero2;
        IO.println("Soma: " + soma);
    }
}
