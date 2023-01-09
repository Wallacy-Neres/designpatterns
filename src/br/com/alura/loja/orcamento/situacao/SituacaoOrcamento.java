package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento já aprovado, não pode ser aprovado novamente");
    }

    public void reprovado(Orcamento orcamento){
        throw new DomainException("Orçamento já reprovado, não pode ser reprovado novamente");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento já finalizado, não pode ser finalizado novamente");
    }
}
