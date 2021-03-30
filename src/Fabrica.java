import transporte.*;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    public static void exibeTiposVeiculo() {
        System.out.println("ATENÇÂO! Esses são os tipos de veículso disponíveis: carro, metro, pedestre e onibus");
    }

    public static Map<String, Veiculo> criatiposVeiculo() {
        Map<String, Veiculo> tiposVeiculo = new HashMap<>();
        tiposVeiculo.put("carro", new Carro());
        tiposVeiculo.put("metro", new Metro());
        tiposVeiculo.put("pedestre", new Pedestre());
        tiposVeiculo.put("onibus", new Onibus());

        return tiposVeiculo;
    }

    public static Veiculo selecionaVeiculo(String tipoVeiculo) {
        Map<String, Veiculo> tiposVeiculo = criatiposVeiculo();

        Veiculo veiculo = null;
        if (!tiposVeiculo.containsKey(tipoVeiculo)) {
            exibeTiposVeiculo();
        } else {
            veiculo = tiposVeiculo.get(tipoVeiculo);
        }
        return veiculo;

    }
}
