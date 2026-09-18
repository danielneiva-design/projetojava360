

public class Algoritmo34 {
    //ENCAPSULAMENTO
    //public - private - protected - package
    //public - qualquer classe pode acessar
    //private - apenas a classe que criou o atributo pode acessar
    //protected - apenas classes autorizadas do mesmo pacote podem acessar
    //package - apenas classes do mesmo pacote podem acessar

    private int primeiroNumero;
    private int segundoNumero;
    public int getPrimeiroNumero() {
        return primeiroNumero;
    }
    public void setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }
    public int getSegundoNumero() {
        return segundoNumero;
    }
    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    /*public int getPrimeiroNumero() {
        return primeiroNumero;
    }
    public void setPrimeiroNumero(int PrimeiroNumero) {
        this.primeiroNumero = PrimeiroNumero;
    }
    public int getSegundoNumero(){
        return segundoNumero;
    }
    public void setSegundoNumero(int SegundoNumero) {
        this.segundoNumero = SegundoNumero;
    }*/
   
  
}
