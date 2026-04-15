package Impostos;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class IPVA implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.09"));
    }
}
