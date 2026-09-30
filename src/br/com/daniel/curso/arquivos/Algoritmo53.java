package br.com.daniel.curso.arquivos;

import java.util.LinkedHashMap; //pacote
import java.util.Map; //pacote
//util que é o pacote
//HashMap é a classe ou Interface dentro do pacote
//um pacote é um conjunto de classes e/ou interfaces
//Posso criar meu pacote, ou utilizar o pacote dos outros

public class Algoritmo53 {
    public void main(){

        //Aurélio (dicionário)
        //Chave - valor
        //Manga - "fruta tropical"
        //Teclado - instrumento musical
        //JAVA - "Ilha do arquipélago de Java, na Indonésia"
        //Dictionary - Dicionário (obsoleta) - legado
        //Generics - Definir qualquer tipo de dado que será armazenado no dicionário <T> - Genérico (recebe qualquer tipo)
        //Toda classe herda de Object, então posso colocar qualquer tipo de dado no dicionário

        Map<String,Estudante> estudantes = new LinkedHashMap<>();

        IO.println("*** Java Doctor - Escola de Programação ***");
        IO.println("* * * * * * * * * * * * * * * * * * * * * *\n");

        estudantes.put("MAT-1223", new Estudante("JP", "ADS", 2025));
        estudantes.put("MAT-1224", new Estudante("Elias", "Ciência da Computação", 2025));
        estudantes.put("MAT-1225", new Estudante("Cassio", "Ciência da Computação", 2015));
        estudantes.put("MAT-1226", new Estudante("Natália", "Ciência da Computação", 2027));
        estudantes.put("MAT-1227", new Estudante("Maria Eduarda", "ADS", 2028));
        estudantes.put("MAT-1228", new Estudante("Julio Cezar", "TSI", 2028));
        estudantes.put("MAT-1229", new Estudante("Gabriel I", "Autodidata", 2026));
        estudantes.put("MAT-1230", new Estudante("Fabio Pio", "Marketing", 2026));
        estudantes.put("MAT-1231", new Estudante("Carlos", "ADS", 2016));
        estudantes.put("MAT-1232", new Estudante("Gabriel II", "Engenharia de Software", 2028));
        estudantes.put("MAT-1233", new Estudante("Thalita", "ADS", 2026));
        estudantes.put("MAT-1234", new Estudante("Rômulo", "GTI", 2012));

        //listar todos os estudantes cadastrados
        for (String matricula : estudantes.keySet()) {
            Estudante estudante = estudantes.get(matricula);
            IO.println(matricula + " - " + estudante);
            IO.println("\n---------------------------\n");
        }

        //buscar um estudante pelo número da matrícula
        String matricula = IO.readln("Digite a matrícula: ");
        Estudante encontrado = estudantes.get(matricula.trim().toUpperCase());
        if (encontrado != null) {
            IO.println("Estudante encontrado: " + encontrado);

        } else {
            IO.println("Estudante não encontrado.");
        }
    }
}