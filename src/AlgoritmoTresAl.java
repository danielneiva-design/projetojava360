package src;

public class AlgoritmoTresAl {
    void main() {
        int chave = Integer.parseInt(IO.readln("Digite o número da Chave: "));
        if (chave == 7) {
            IO.println("A porta verde água se abre.");
        } else {
            IO.println("A porta cobra se abre.");
        }

        String classe = IO.readln("Escolha: Guerreiro, Mago, Paladino ou Clérigo: ");
        if (classe.equals("Guerreiro")) {
            IO.println("A porta do escudo se abre.");
        } else if (classe.equals("Mago")) {
            IO.println("A porta do livro se abre.");
        } else if (classe.equals("Paladino")) {
            IO.println("A porta da chave se abre.");
        } else if (classe.equals("Clérigo")) {
            IO.println("A porta da espada se abre.");
        } else {
            IO.println("A porta da espada se abre por padrão.");
        }

        int nivel = Integer.parseInt(IO.readln("Nível: "));
        boolean temChave = IO.readln("Tem a chave? (sim/não): ").equals("sim");
        if (nivel >= 5 && temChave) {
            IO.println("O Guardião se curva. Pode passar.");
        } else {
            IO.println("O Guardião nega com a cabeça.");
        }

        String simbolo = IO.readln("Pise em qual símbolo? ");
        String resultado = switch (simbolo) {
            case "sol" -> "O selo aquece sob seus pés.";
            case "lua" -> "O selo esfria e brilha em prata.";
            case "estrela" -> "O selo ergue uma escada de luz.";
            default -> "O selo permanece em silêncio. \n";
        };
        IO.println(resultado);

        IO.println("\nUma escada de luz realmente se ergueu diante dele, subindo em direção a uma abertura no teto do corredor");
    }
}
