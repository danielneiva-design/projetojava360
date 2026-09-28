import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formatação

public class Algoritmo52 {
    public void main(){

        int r = 0;
        do{
            try(){

                //manipular arquivo aqui

            }catch(Exception e){
                IO.print(e.getMessage());

            }finally{

            }
            IO.print("Adicionar mensagem:\n1[sim] 0[não]");
            r = Integer.parseInt(IO.readln(""));

        }while(r == 1);

    }
}
