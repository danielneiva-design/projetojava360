package src;

public class AlgoritmoTrezeAl {
    void main() {
        IO.println("Vamos calcular qual número é maior.");
        int num1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        int num2 = Integer.parseInt(IO.readln("Digite o segundo número: "));

        if (num1 > num2) {
            IO.println("O número " + num1 + " é maior que o número " + num2);
        }else {
            IO.println("O número " + num2 + " é maior que o número " + num1);
        }
    
    }
}