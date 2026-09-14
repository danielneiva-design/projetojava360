public class Carro {

    String marca;
    String modelo;
    int ano;
    String potencia;
    private int velocidade;

    Carro(String novaMarca, String novoModelo, int novoAno, String novaPotencia) {
        marca = novaMarca;
        modelo = novoModelo;
        ano = novoAno;
        potencia = novaPotencia;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    void setVelocidade(int novaVelocidade) {

        if (novaVelocidade >= 0 && novaVelocidade <= 200) {
        velocidade = novaVelocidade;
        }else{
            IO.println("Velocidade inválida! A velocidade deve estar entre 0 e 200 km/h.");
        }
    }

    void ligar() {
        IO.print("O carro " + marca + " " + modelo + " foi ligado.");
    }
    void acelerar() {
        if (velocidade < 200) {
            velocidade += 25;
            IO.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            IO.println("Velocidade máxima atingida!");
        }
    }
    void frear() {
        if (velocidade > 0) {
            velocidade -= 25;
            IO.println("Freando... Velocidade atual: " + velocidade + " km/h");
        } else {
            IO.println("O carro já está parado!");
        }
    }
}

