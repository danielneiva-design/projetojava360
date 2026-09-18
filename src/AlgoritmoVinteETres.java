

public class AlgoritmoVinteETres {
    //EXERCÍCIO DEMONSTRA O QUE É UMA VARIÁVEL SIMPLES PARA DEPOIS INTRODUZIR VETORES QUE VÃO AJUDAR NA COMPLEXIDADE DE QUANTIDADE DE NÚMEROS
    public void main(){
        //Variáveis simples
        IO.println("=== PREENCHIMENTO DE VARIÁVEIS SIMPLES ===\n");
        //1. Leitura individual de cada variável
        IO.println("Digite o 1o número:");
        int numero1 = Integer.parseInt(IO.readln());

        IO.println("Digite o 2o número:");
        int numero2 = Integer.parseInt(IO.readln());

        IO.println("Digite o 3o número:");
        int numero3 = Integer.parseInt(IO.readln());

        IO.println("Digite o 4o número:");
        int numero4 = Integer.parseInt(IO.readln());

        IO.println("Digite o 5o número:");
        int numero5 = Integer.parseInt(IO.readln());

        //2. Exibição individual de cada variável
        IO.println("\n=== VALORES GUARDADOS ===");
        IO.println("1o número: " + numero1);
        IO.println("2o número: " + numero2);
        IO.println("3o número: " + numero3);
        IO.println("4o número: " + numero4);
        IO.println("5o número: " + numero5);
    }
}
