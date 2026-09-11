package src;

public class AlgoritmoVinteEUmAl {
    void main() {
        int [] numeros = {45, 67, 89, 34, 23, 56 , 78, 98,45, 34};
        float soma = 0;
        int quantidade = 0;

        for (int valor : numeros) {
            soma = soma + valor;
            quantidade++;
        }
        IO.println("A soma total dos números é: " + soma);
        float media = soma / quantidade;
        IO.println("A média dos números é: " + media);        
    }
}
