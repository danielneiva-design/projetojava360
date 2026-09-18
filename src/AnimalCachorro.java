public class AnimalCachorro extends Animal {
       
    //No processo de herança, o construtor não é herdado, mas pode ser chamado através do super().
    
    public AnimalCachorro(String nome, String tocarSom, String comer) {
        super(nome, tocarSom, comer);
    }

    
    @Override
    public void arquivoSom() {
        IO.println("O cachorro está latindo");
    }
    @Override
    public void comer() {
        IO.println("O cachorro está comendo ração.");
    }
    


        /*IO.println("***C A C H O R R O***");
        Animal Cachorro = new Animal("O cachorro se chama Max", "Max está latindo", "Max está comendo ração");
        IO.println(Cachorro.getNome());
        IO.println(Cachorro.getTocarSom());
        IO.println(Cachorro.getComer());
        */


}

