package br.com.daniel.curso.arquivos;
import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formatação

public class Algoritmo52 {
    public void main(){
        IO.println("\nBem-vindo ao diário de dúvidas!\nAqui você pode registrar suas dúvidas e salvá-las em um arquivo de texto.\n");
        int r = 0;
        do{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            IO.println("Qual é a sua dúvida?\n");
            String duvida = IO.readln();
            String carimbo = LocalDateTime.now().format(formato);
            try (FileWriter arquivo = new FileWriter("diario.txt", true)){
                //manipular arquivo aqui
                
                arquivo.write(carimbo + " - " + duvida + "\n");
                IO.println("Registrado: [" + carimbo + "] " + duvida + "\n");                
                IO.println("Deseja registrar outra dúvida?\n1[sim] 0[não]\n");
                
            }catch(IOException e){
                IO.println("Erro ao salvar no diário: " + e.getMessage() + "\n");
            }
            r = Integer.parseInt(IO.readln(""));

        }while(r == 1);
        
        IO.println("\nObrigado por usar o diário de dúvidas!");
    }
}

/*
  ARQUIVOS
 
 .docx    (Microsoft Word)
 .xlsx    (Microsoft Excel)
 .html    (Criar um site)
 .css     (Estilizar um site)
 .js      (Interatividade do site)
 .xml     (Dados e Tags)
 .json    (Dados (o.o))
 .parquet (Dados em big data)
 .csv     (Dados separados por vírgulas)
 .txt     (Dados em formato de texto)
 .java    (Um arquivo Java)
 .sql     (Scripts DDL, DML, DQL, DCL ou DTL)

 DBA, ANALISTA, CIENTISTA OU ENGENHEIRO DE DADOS

 DATALAKES:
 - Estruturados (MySQL)
 - Semiestruturados (JSON)
 - Não estruturados (imagem)

 .xlsx    (Microsoft Excel)
 .xml     (Dados e Tags)
 .json    (Dados (o.o))
 .parquet (Dados em big data)
 .csv     (Dados separados por vírgulas)
 .txt     (Dados em formato de texto)
 .sql     (Scripts DML — Data Manipulation Language)
 */