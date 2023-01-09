package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImposto {

    //Padrão Strategy

    //Quando já sabemos o que usar o strategy é o mais indicado
    //Neste caso sabemos o tipo de imposto a ser calculado, não temos nenhum condicional


    BigDecimal calcular(Orcamento orcamento);
}
