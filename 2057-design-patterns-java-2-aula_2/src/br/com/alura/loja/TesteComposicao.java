package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    // composite

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento(BigDecimal.ZERO, 0);
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento(BigDecimal.ZERO, 0);
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);


        System.out.println(novo.getValor());
    }


}
