

public class Principal {
    void main() {
        //O objeto é a instância de uma classe, ou seja, a classe é o molde e o objeto é a instância desse molde.
        Algoritmo31 objeto = new Algoritmo31();
        //classe    obj at op construtor
        IO.println(objeto.getAloMundo());
        objeto.PrintarNaTela();
        Algoritmo33Al objeto3 = new Algoritmo33Al();
        objeto3.inserirChave(7);
        IO.println(objeto3.retornarChave());
        IO.println(objeto3.abrirPorta());
        Algoritmo33Al objeto4 = new Algoritmo33Al();
        objeto4.inserirChave(20);
        IO.println(objeto4.retornarChave());        
        IO.println(objeto4.abrirPorta());

        Algoritmo34 objeto5 = new Algoritmo34();
        objeto5.setPrimeiroNumero(10);
        IO.println(objeto5.getPrimeiroNumero());
        objeto5.setSegundoNumero(20);
        IO.println(objeto5.getSegundoNumero());
    }

public String mostrarSalaDoEco(String nome) {
        String res = "Quem ousa entrar na sala do Eco?";
        String resNome = "Ah... " + nome + ". Eu esperava por você.";
        return res + "\n" + resNome;
    }
}
