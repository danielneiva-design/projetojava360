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

    //operador ternário
        int n1 = Integer.parseInt(IO.readln("entre com um número: "));
        //? significa "então" e : significa "senão"
        String resultado = (n1 > 0) ? "Número positivo" : (n1 < 0) ? "Número negativo" : "Número nulo";
        IO.println(resultado);
    
        //estrutura de seleção múltipla
        int numAula = Integer.parseInt(IO.readln("entre com um número de 1 a 5 para escolher sua Aula: "));
        switch (numAula) {
            case 1 -> IO.println("Aula 1 - segunda-feira");
            case 2 -> IO.println("Aula 2 - terça-feira");
            case 3 -> IO.println("Aula 3 - quarta-feira");
            case 4 -> IO.println("Aula 4 - quinta-feira");
            case 5 -> IO.println("Aula 5 - sexta-feira");
            default -> IO.println("Não temos aula nesse dia.");
        }
    }
}    