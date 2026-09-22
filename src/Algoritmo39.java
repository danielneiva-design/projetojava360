import javax.swing.JOptionPane;

public class Algoritmo39 {
    /*
    Revisão: Classe avstrata, interfaces, polimorfismo
    Encapsulamento e Static

    Transporte
    Onibus
    Metro
    */
    public void main(){
        Onibus o1 = new Onibus("PCU 9338");
        Onibus o2 = new Onibus("JVS 9876");        
        Onibus o3 = new Onibus("OVH 7643");
    
        Metro m1 = new Metro("RRR 5778");
        Metro m2 = new Metro("VVV 1234");
        Metro m3 = new Metro("AMO 6547");
        
        int op;
        final String TITULO = "VIAÇÃO TRANSPORTES";
        int tipoMensagem = JOptionPane.WARNING_MESSAGE;
        int erroMensagem = JOptionPane.ERROR_MESSAGE;

        do{        
        String opcao = JOptionPane.showInputDialog(null,"Escolha qual tarifa você deseja consultar:\n1 - Ônibus \n2 - Metrô \n3 - Sair", TITULO, tipoMensagem);
        op = Integer.parseInt(opcao);

        if(op == 1){
            JOptionPane.showMessageDialog(null, o1.calcularTarifa(), TITULO, tipoMensagem);
            JOptionPane.showMessageDialog(null, "Frota de " + Onibus.getCont() + " ônibus.", TITULO, tipoMensagem);
        }else if(op == 2){
            JOptionPane.showMessageDialog(null, m1.calcularTarifa(), TITULO, tipoMensagem);
        }else if(op == 3){
            JOptionPane.showMessageDialog(null, "Até logo.", TITULO, tipoMensagem);
        }else{
            JOptionPane.showMessageDialog(null, "Opção Inválida!", TITULO, erroMensagem);
        }
        }while(op != 3);

    }
}
