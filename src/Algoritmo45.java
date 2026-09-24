import java.util.List;

public class Algoritmo45 {
    public void main(){

    //JAVA Collections
    //JAVA 5
    /*

    List (Interface) ---> ArrayList(Classe implementa)
    
    */
        List<String> tarefas = List.of("teste de mesa", "algoritmos", "oo");
            for(String tarefa : tarefas){
                //singular - elemento
                //plural - coleção 
                IO.println(tarefa);
            }
            

    }
}
