package src;

public class Principal {
    void main() {
        //O objeto é a instância de uma classe, ou seja, a classe é o molde e o objeto é a instância desse molde.
        Algoritmo31 objeto = new Algoritmo31();
        //classe    obj at op construtor
        IO.println(objeto.getAloMundo());
        objeto.PrintarNaTela();
    }

public String mostrarSalaDoEco(String nome) {
        String res = "Quem ousa entrar na sala do Eco?";
        String resNome = "Ah... " + nome + ". Eu esperava por você.";
        return res + "\n" + resNome;
    }
}
