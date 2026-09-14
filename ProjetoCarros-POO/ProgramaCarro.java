public class ProgramaCarro {
    void main(){
        Carro carroDaniel =
        new Carro("Porsche", "911 Carrera Turbo", 2023, "650 cv");
        carroDaniel.ligar();
        for (int i = 0; i < 10; i++) {
            carroDaniel.acelerar();
        }
        IO.println(carroDaniel.getVelocidade());
        for (int i = 0; i < 9; i++) {
            carroDaniel.frear();
        }
        IO.println(carroDaniel.getVelocidade());
        carroDaniel.setVelocidade(100);
        IO.println("Velocidade: " + carroDaniel.getVelocidade());


        Carro carroCarla =
        new Carro("Ferrari", "F8 Tributo", 2023, "720 cv");
        carroCarla.ligar();
        for (int i = 0; i < 9; i++) {
            carroCarla.acelerar();
        }
        IO.println(carroCarla.getVelocidade());
        for (int i = 0; i<9; i++) {
            carroCarla.frear();
        }
        IO.println(carroCarla.getVelocidade());
        carroCarla.setVelocidade(100);
        IO.println("Velocidade: " + carroCarla.getVelocidade());


    }
}
