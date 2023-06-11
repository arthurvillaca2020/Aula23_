import org.example.BoletoEmAtraso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class teste {
    @Test
    void deveRetonarAtrasado() {
        BoletoEmAtraso boletoEmAtraso = new BoletoEmAtraso();
        boletoEmAtraso.setNome("Boleto Uniacademia");
        boletoEmAtraso.setNumeroBoleto(1000999922);
        boletoEmAtraso.setDiasAtraso(4);
        boletoEmAtraso.setValor(999.33f);
        assertEquals("Atrasado", boletoEmAtraso.verificarAtraso());
    }

    @Test
    void deveRetonarReprovado() {
        BoletoEmAtraso boletoEmAtraso = new BoletoEmAtraso();
        boletoEmAtraso.setNome("Boleto Uniacademia");
        boletoEmAtraso.setNumeroBoleto(1000999922);
        boletoEmAtraso.setDiasAtraso(-4);
        boletoEmAtraso.setValor(999.33f);
        assertEquals("Em dia", boletoEmAtraso.verificarAtraso());
    }

    @Test
    void deveRetornarInformacoes() {
        BoletoEmAtraso boletoEmAtraso = new BoletoEmAtraso();
        boletoEmAtraso.setNome("Boleto Uniacademia");
        boletoEmAtraso.setNumeroBoleto(1000999922);
        boletoEmAtraso.setDiasAtraso(-4);
        boletoEmAtraso.setValor(999.33f);
        assertEquals("Boleto{Numero do boleto=1000999922, Nome='Boleto Uniacademia', Valor='999.33', Esta atrasado? Em dia}", boletoEmAtraso.getInfo());
    }
}
