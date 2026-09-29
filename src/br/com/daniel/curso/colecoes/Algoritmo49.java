package br.com.daniel.curso.colecoes;
import java.util.List;
import java.util.ArrayList;

public class Algoritmo49 {

    /*
    
    Crie um algoritmo que pergunte
    println (Qual laboratório quer adicionar?)
    leia o laboratório do usiário
    o laboratório é String tipo : F03, F05, F07

    Crie um loop 1- adicionar 2-sair 
    mostre no final a quantidade de laboratórios adicionados
    mostre todos os laboratórios
    List<String> laboratorios ArrayList<>();

    */

    public void main(){

        List<String> laboratorios = new ArrayList<>();

        int opcao;
        int contador = 0;

        
        do{            
            IO.println("1- Adicionar Laboratório\n2-Sair");
            opcao = Integer.parseInt(IO.readln("Escolha a opção desejada:\n"));
            if(opcao == 1){
                String laboratorio = IO.readln("Qual laboratório quer adicionar?\nF03, F05, F07\n");
                if(laboratorio.equals("F03") || laboratorio.equals("F05") || laboratorio.equals("F07")){
                    laboratorios.add(laboratorio);
                    contador++;
                }else{
                    IO.println("Você não pode acessar essa sala!");
                };
                
                
                }
        
        }
        while(opcao != 2 && contador <= 2);
        IO.println("Laboratórios adicionados: " + laboratorios);
        IO.println("Número de laboratórios adicionados: " + laboratorios.size());

    }
}

