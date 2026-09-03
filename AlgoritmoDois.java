public class AlgoritmoDois {
    void main(String[] args) {
        IO.println("Seja bem-vindo ao portal Java 360!");
        String usuario = IO.readln("Qual o seu nome? ");
        IO.println("Olá, " + usuario + "!" + " Seja bem-vindo ao portal Java 360!");
        //int estrelas = 0; - mais rápido do que Integer.parseInt() porém sem métodos
        // Integer.parseInt(valor para conversão) - mais lento, porém com métodos (Classes Wrappers)

        int estrelas = 0;
        IO.println("Quem Criou o Java?");
        IO.println("1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve Jobs");
        IO.println("4 - Mark Zuckerberg");
        IO.println("5 - Linus Torvalds");
        int resp = Integer.parseInt(IO.readln("Digite o número da resposta correta: "));
        if (resp == 1) {
            IO.println("Parabéns, " + usuario + "! Você acertou!");
            estrelas = estrelas + 1; //variável de incremento
            //estrelas++;
        } else {
            IO.println("Que pena, " + usuario + "! Você errou!");
        }
        IO.println("Você obteve " + estrelas + " estrelas.");
    }
}
