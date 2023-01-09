package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    // Design pattern Chain of Responsibility
    // cuja principal função é evitar a dependência entre um objeto receptor e um objeto solicitante.
    // Exemplo: Neste caso tinhamos alguns tipos de descontos a serem aplicados
    // portanto conforme mais descontos fossem adicionados, mais condicionais seriam necessarios
    // Criar uma classe abstrata para chamar o proximo tipo de desconto, herdar esta classe em cada tipo de desconto
    // possibilitou passa o proximo desconto como um parametro, desta forma não foi necessario adicionar condionais
    // e para finalizar a busca por um novo desconto, bastou criar uma classe para ser usada como um break;

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
      if(deveAplicar(orcamento)){
          return efetuarCalculo(orcamento);
      }

      return proximo.calcular(orcamento);
    };

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
