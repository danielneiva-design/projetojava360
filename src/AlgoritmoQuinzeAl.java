package src;

public class AlgoritmoQuinzeAl {
    void main() {
        //Vamos mostrar os números pares de 0 a 200!
        IO.println("Quais os números pares de 0 a 200?");
        for (int i = 0; i <= 200; i++) {
            float resto = i % 2;
            if (resto == 0) {
                IO.println(i);
            }
        }
    }
}
