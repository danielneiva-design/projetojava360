package src;

public class AlgoritmoDezesseisAl {
    public void main() {
        IO.println("Vamos contar os pares de 0 a 200 usando while!");
        int i = 1;
        while (i <= 200) {
            float resto = i % 2;
            if (resto == 0) {
            IO.println(i);
            }
        i++;
        }
    }
}
