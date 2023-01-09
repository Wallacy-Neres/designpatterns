package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dadosPedido){
        Orcamento orcamento = new Orcamento(dadosPedido.getValorOrcamento(), dadosPedido.getQuantidadeItens());

        Pedido pedido = new Pedido(dadosPedido.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }
}
