import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {

    public void main(){

        //List (Lista) - 100, 40, 50, 56
        //Dicionário - Dictionary - 100:Maria, 40:JP, 50:Daniel, 56:Cassio
        //ArrayList implementa List
        //HashMap implementa Map (chave -> valor)
        //HashSet implementa Set (conjunto)
        //LinkedList implementa Queue (fila)

        List<String> frutas = new ArrayList<>();
        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");

        IO.println("Primeira fruta: " + frutas.get(0));
        IO.println("Segunda fruta: " + frutas.get(1));
        IO.println("Terceira fruta: " + frutas.get(2));
        IO.println("Quarta fruta: " + frutas.get(3));

        frutas.set(1, "Uva");

        IO.println("Nova segunda fruta: " + frutas.get(1));
        IO.println(frutas);

        for(String fruta : frutas){
            IO.println(fruta);
        }

        IO.println("Total de frutas: " + frutas.size());
        
        IO.println("Remover o Mamão.");
        frutas.remove("Mamão");
        IO.println(frutas);
        IO.println("Total de frutas: " + frutas.size());
        for(String fruta : frutas){
            IO.println(fruta);
        }
    }
}
