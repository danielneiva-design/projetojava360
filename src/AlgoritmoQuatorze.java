package src;

public class AlgoritmoQuatorze {
    void main() {
        //Considere um menu de  um joguinho. Esse menu deverá mostrar uma mensagem personalizada.
        IO.println("*** M E N U ***\n");
        IO.println("\n1 - Iniciar Jogo");
        IO.println("2 - Quantas vidas tenho?");
        IO.println("3 - Morrer\n");
        int opcao = Integer.parseInt(IO.readln("\n Selecione a opção desejada (01 a 03):"));
        switch (opcao) {
            case 1 -> IO.println("Jogo Iniciado!\n");
            case 2 -> IO.println("Poucas vidas restantes!\n");
            case 3 -> IO.println("*** G A M E * O V E R ***\n");
            default -> IO.println("Opção inválida!");
        }

        
    }
}
