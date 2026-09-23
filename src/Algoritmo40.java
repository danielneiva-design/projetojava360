public class Algoritmo40 {
    void main(){
        /*

        Vetor = matriz unidimensional
        acadêmico - programação simples básico

        Tabela = matriz bidimensional
        banco de dados, planilha Excel

        3D = matriz tridimensional
        Cinema, desenhos, animações, games (GTA 6)
        AutoCAD, Revit, SketchUP
        Humanoide - Softwares 3D simulação
        Minecraft - X, Y e Z (coordenadas de posicionamento)

        Vetor ou matriz unidimensional
        https://www.somatematica.com.br/emedio/matrizes/matrizes.php
        matriz linha ou matriz coluna

        */

        int[] notas = {7, 9, 5, 10, 6};
        //Variáveis de valor e de referência
        int maior = notas[0];
        IO.println(maior);

        //e se fosse uma lista de 3 milhões de números?

        //útil para Big Data
        for(int i = 1; i < notas.length; i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        IO.println("Maior nota: " + maior);

        //colchete no JAVA é um vetor, ou uma MATRIZ UNIDIMENSIONAL (Array, que é o objeto da POO em JAVA)
        //o @ é o endereço do objeto
        

    }
}
