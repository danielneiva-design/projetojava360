package src;

public class AlgoritmoDoisAl {
    void main() {
        IO.println("Quem ousa entrar na Sala do Eco?");
        String nome = IO.readln();
        IO.println("Ah..." + nome + ". Eu esperava por você.");

        IO.println("Quantos algoritmos você já venceu?");
        String resposta = IO.readln();
        int total = Integer.parseInt(resposta);
        IO.println("Só mais " + (360 - total) + " pela frente.");

        IO.println("Eco registrado. Kaito ouviu, e foi ouvido.");
        IO.println("Próximo selo: Algoritmo 03 - Estruturas e Decisão.");
    }
}
