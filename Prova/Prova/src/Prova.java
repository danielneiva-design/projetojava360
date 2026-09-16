public class Prova {
    public void main() {
        EcoFinal meuEco = new EcoFinal();
        meuEco.despertar("Daniel");
        String segredo = meuEco.revelarSegredo();
        IO.println(segredo);
    }
}
