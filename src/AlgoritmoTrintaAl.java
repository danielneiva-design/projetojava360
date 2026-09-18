

public class AlgoritmoTrintaAl {
    public void main() {
        //Crie um algoritmo que leia um número para calcular o fatorial. Ele deve calcular o fatorial e armazenar em um vetor cada etapa (resultado) do calculo. No final ele deve listar as etapas (cálculos parciais) e o resultado final do fatorial.
        int numeroEscolhido = Integer.parseInt(IO.readln("Digite o número desejado para calcularmos o fatorial: "));
       
        int[] numero = new int[numeroEscolhido];
        double fatorial = 1;
        
        for (int i = 0; i < numeroEscolhido; i++) {
            fatorial *= numeroEscolhido - i;
            numero[i] = (int) fatorial;                       
        }
        IO.println("Resultado final: " + fatorial);
        IO.println("\nEtapas do cálculo:");
        for (int i = 0; i < numeroEscolhido; i++) {
            IO.println("\nEtapa " + (i + 1) + ": " + numero[i]);
        }
        IO.println("\nResultado final: " + fatorial);

    }
}
