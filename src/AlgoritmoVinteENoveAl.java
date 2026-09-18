

public class AlgoritmoVinteENoveAl {
    public void main(){
        //Crie um algoritmo que armazene as vendas do ano em um vetor e mostre o total da venda anual e a média anual.
        int[] vendas = new int[12];

        double totalVendas = 0;

        for (int i = 0; i < vendas.length; i++) {
            vendas[i] = Integer.parseInt(IO.readln("Entre com o valor da venda do mês " + (i + 1) + ": "));
            totalVendas += vendas[i];
        }

        double mediaVendas = (double) totalVendas / vendas.length;
        System.out.printf("Total de vendas do ano: R$ %.2f%n", totalVendas);
        System.out.printf("Média mensal de vendas: R$ %.2f%n", mediaVendas);
    }
}
