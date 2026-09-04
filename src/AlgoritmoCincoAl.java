package src;

public class AlgoritmoCincoAl {
    void main() {
        //Ler um número inteiro e imprimir seu sucessor e seu antecessor.
        int numeroInteiro = Integer.parseInt(IO.readln("Digite um número de 0 a 99: "));
        int sucessor = numeroInteiro + 1;
        int antecessor = numeroInteiro - 1;
        IO.println("Sucessor: " + sucessor);
        IO.println("Antecessor: " + antecessor);
    }
}
