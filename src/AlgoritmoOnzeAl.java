package src;

public class AlgoritmoOnzeAl {
    void main() {
        String nome = "Daniel";
        String entrada = IO.readln("Digite seu nome: ");
        if (entrada.equalsIgnoreCase(nome)) {
            IO.println("Olá, Daniel! Seja bem-vindo!");
        }else {
            IO.println("Nome inválido! Por favor, digite o nome correto.");
        }

    }
}

