public class Moto extends Veiculo implements IManutencao, IMeusImpostos {
    private Boolean temBau;

    public Moto() {
        super();
    }

    public Moto(String placa, int velocidadeMax,
                String tipoCombustivel, String cor,
                boolean temBau) {

        super(placa, velocidadeMax,
              tipoCombustivel, cor);
        this.temBau = temBau;
    }

    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    public void mover() {
        IO.print("A moto se moveu!\n");
        IO.println("*************************");
    }

    @Override
    public void adicionar() {
        IO.println("Impostos adicionados.\n");
        IO.println("*************************\n");
    }

    @Override
    public void revisaoProgramada() {
        IO.println("Faça a revisão com a taxa de: " + IManutencao.TAXA + "\n");
        IO.println("*************************\n");
    }
}
