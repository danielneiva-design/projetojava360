package src;
import java.util.List;

public class AlgoritmoVinteAl {
    public static void main(String[] args) {
        List<String> cupons = List.of("CUPOM10", "DESCONTAO", "PROMO30", "FRETENAFAIXA");
        cupons.forEach(IO::println);
    }
}
