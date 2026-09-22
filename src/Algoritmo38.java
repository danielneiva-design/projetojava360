import javax.swing.JOptionPane;

public class Algoritmo38 {

    /*
    Básica:
        Objeto
        GET e SET
        Classe
        Métodos Workers
        Construtor
    Avançado
        herança
        classe abstrata
        encapsulamento
        interfaces
        comparativo
        static
    */

    public void main() {
        JOptionPane.showMessageDialog(null, "Agência ***SENAI Car***");
        Carro c1 = new Carro("JBP-9999",
                             200,
                             "Flex",
                             "Azul", 
                             4);
        JOptionPane.showMessageDialog(null, c1.getPlaca());
        JOptionPane.showMessageDialog(null, c1.getCor());
        JOptionPane.showMessageDialog(null, c1.getTipoCombustivel());
        JOptionPane.showMessageDialog(null, c1.getVelocidadeMax());
        c1.mover();
        c1.revisaoProgramada();
        c1.adicionar();

        Moto m1 = new Moto("PET 6666",
                           320,
                           "Gasolina",
                           "Preta", false);
        
        JOptionPane.showMessageDialog(null, m1.getPlaca());
        JOptionPane.showMessageDialog(null, m1.getCor());
        JOptionPane.showMessageDialog(null, m1.getTipoCombustivel());
        JOptionPane.showMessageDialog(null, m1.getVelocidadeMax());
        m1.mover();
        m1.revisaoProgramada();
        m1.adicionar();
    }

}
