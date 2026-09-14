package src;

public class AlgoritmoVinteEDoisAl {
    void main(){
        IO.println("Bem-vindo ao sistema de financiamento SENATECH! \n");

        int contador = 0;
        int logado = 0;
        String usuario = "senai";
        int valor;
        int parcelas;
        double valorFinanciado = 0;
        double valorJuros;
        double valorComJuros;
        double valorParcela;

        do {
        usuario = IO.readln("Por gentileza, digite seu usuário: ");
        String senha = IO.readln("Por gentileza, digite sua senha: ");
            if (usuario.equalsIgnoreCase("senai") && senha.equalsIgnoreCase("senai123")){
                logado = 1;
                contador = 3;
            }else if (contador <= 1) {
                IO.println("Usuário e/ou senha incorretas! Tente novamente!");
                logado = 0;
                contador++;
            }else {
                IO.println("Cartão bloqueado. Procure o gerente!");
                logado = 0;
                contador++;
            }
            }while (contador < 3);
                
        if (logado == 1){
            IO.println("Bem-vindo, " + usuario + "!");
           
            IO.println("\n Você possui um limite pré-aprovado para financiamento de até R$ 20.000,00!\n");
            IO.println("Selecione uma das opções:\n");
            IO.println("1 - R$ 5.000,00");
            IO.println("2 - R$ 10.000,00");
            IO.println("3 - R$ 15.000,00");
            IO.println("4 - R$ 20.000,00");
            
            do {
                valor = Integer.parseInt(IO.readln("\nDigite o número referente ao valor desejado para contratação:\n"));
                switch (valor) {
                    case 1 -> {
                        valorFinanciado = 5000;
                        IO.println("R$ 5.000,00");
                    }
                    case 2 -> {
                        valorFinanciado = 10000;
                        IO.println("R$ 10.000,00");
                    }
                    case 3 -> {
                        valorFinanciado = 15000;
                        IO.println("R$ 15.000,00");
                    }
                    case 4 -> {
                        valorFinanciado = 20000;
                        IO.println("R$ 20.000,00");
                    }
                    default -> IO.println("Opção inválida! Tente novamente:");
                }
            }while (valor < 1 || valor > 4);
            
            IO.println("\n Excelente, " + usuario + "! Você selecionou a opção " + valor + " para contratação do financiamento, no valor de R$ " + valorFinanciado + ".\n");
           
            IO.println("\n Nossa taxa de juros do financiamento é uma das menores do mercado e você ainda pode parcelar em até 10x!\n");
            IO.println("\nEm quantas parcelas você deseja contratar? (*Juros de apenas 1% a.m.):\n");
            
            do {
                parcelas = Integer.parseInt(IO.readln("Digite o número de parcelas desejadas (1 a 10):\n"));
                if (parcelas < 1 || parcelas > 10){
                    IO.println("Opção inválida! Tente novamente:");
                }
            }while (parcelas < 1 || parcelas > 10);

            
            valorJuros = valorFinanciado * 0.01 * parcelas;
            valorComJuros = valorFinanciado + valorJuros;
            valorParcela = valorComJuros / parcelas;

            IO.println("\nResumo do financiamento:\n");
            System.out.printf("Valor do financiamento: R$ %.2f%n", valorFinanciado);
            System.out.printf("Valor dos juros: R$ %.2f%n", valorJuros);
            System.out.printf("Valor total a ser pago: R$ %.2f%n", valorComJuros);
            IO.println("Total de parcelas: " + parcelas + "\n");
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
            IO.println("\n Parabéns, " + usuario + "! Seja bem-vindo à família SENATECH!\n");
            


            }else {}
    }    
}
           
    



    
            /*if (contador < 2){
                IO.println("");
                contador++;
            }else if (contador == 3){
                
                contador++;  */
