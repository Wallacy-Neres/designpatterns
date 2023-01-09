package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
