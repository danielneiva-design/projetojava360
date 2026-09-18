public class AnimalGato extends Animal {
    public AnimalGato(String nome, String tocarSom, String comer) {
        super(nome, tocarSom, comer);
    }

    @Override
    public void arquivoSom() {
        System.out.println("O gato " + getNome() + " faz " + getTocarSom());
    }

    @Override
    public void comer() {
        System.out.println("O gato " + getNome() + " come " + getComer());
    }
}
