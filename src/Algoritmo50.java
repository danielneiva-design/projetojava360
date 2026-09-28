public class Algoritmo50 {

    void main(){

        try {//tentar
            int idade = Integer.parseInt(
                        IO.readln("Qual a sua idade?\n"));
            String resultado = (idade >= 18) ? "\nmaior\n" : "\nmenor\n";
            IO.print(resultado);
        }catch(NumberFormatException e){
            //erro
            IO.println(e.getMessage() + "\nValor inválido! Digite um número:\n");

        }finally{
            //independente de dar certo ou errado
            //conclusão
            IO.println("\nDeu tudo certo! Encerrando o sistema!");

        }

    }

}
