package src;

public class AlgoritmoQuatroIf {
    void main() {
        //entre com um número inteiro e mostre se ele é positivo, negativo ou nulo
        int n = Integer.parseInt(IO.readln("entre com um número: "));
        if (n > 0) {
            IO.println("Número positivo");
        } else if (n < 0) {
            IO.println("Número negativo");
        } else {
            IO.println("Número nulo");
        }
    }
}