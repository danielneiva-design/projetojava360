package src;

public class AlgoritmoVinteEDoisAl {
    void main(){
        IO.println("Bem-vindo ao sistema de financiamento SENATECH! \n");

        int contador = 0;
        int logado = 0;
        String usuario = "senai";
        int valor;

        do {
        usuario = IO.readln("Por gentileza, digite seu usuário: ");
        String senha = IO.readln("Por gentileza, digite sua senha: ");
            if (usuario.equalsIgnoreCase("senai") && senha.equalsIgnoreCase("senai123")){
                logado = 1;
                contador = 3;
            }else if (contador <= 2) {
                IO.println("Usuário e/ou senha incorretas! Tente novamente!");
                logado = 0;
                contador++;
            }else {
                contador++;
            }
        }while (contador < 3);
                
        if (logado == 1){
            IO.println("Bem-vindo, " + usuario + "!");
           
            IO.println("\n Você possui um limite pré-aprovado de financiamento no valor de R$ 20.000,00!\n");
            IO.println("Selecione uma das opções:\n");
            IO.println("1 - R$ 5.000,00");
            IO.println("2 - R$ 10.000,00");
            IO.println("3 - R$ 15.000,00");
            IO.println("4 - R$ 20.000,00");
            
            valor = Integer.parseInt(IO.readln("\nDigite o número referente ao valor desejado para contratação:\n"));
                switch (valor) {
                    case 1 -> IO.println("R$ 5.000,00");
                    case 2 -> IO.println("R$ 10.000,00");
                    case 3 -> IO.println("R$ 15.000,00");
                    case 4 -> IO.println("R$ 20.000,00");
                    default -> IO.println("Opção inválida! Tente novamente:");
                }
            }else {
            IO.println("Cartão bloqueado. Procure o gerente!");
        }
        

            /*if (contador < 2){
                IO.println("");
                contador++;
            }else if (contador == 3){
                
                contador++;  */


    }
}