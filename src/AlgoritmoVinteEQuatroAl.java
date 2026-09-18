

public class AlgoritmoVinteEQuatroAl {
    public void main() {
        //Definindo um vetor de 5 posições
        int[] numeros = new int[5];

        //Preenchimento do vetor com os números digitados pelo usuário
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número desejado:"));
        }

        //Exibição dos números digitados
        IO.println("=== NÚMEROS DIGITADOS ===");
        for (int i = 0; i< numeros.length; i++){
            IO.println("Número " + (i+1) + ": " + numeros[i]);
        }
    }
}
