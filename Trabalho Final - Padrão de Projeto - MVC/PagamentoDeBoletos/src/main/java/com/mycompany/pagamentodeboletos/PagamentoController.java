/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentodeboletos;

/**
 *
 * @author 55649
 */
public class PagamentoController {
    private Cliente cliente;
    private PagamentoView view;

    public PagamentoController(Cliente cliente, PagamentoView view) {
        this.cliente = cliente;
        this.view = view;
    }

    public void exibirBoletos() {
        view.exibirBoletos(cliente.getBoletos());
    }

    public void pagarBoleto(String numeroBoleto) {
        for (Boleto boleto : cliente.getBoletos()) {
            if (boleto.getNumero().equals(numeroBoleto)) {
                boleto.pagar();
                view.exibirConfirmacaoPagamento(numeroBoleto);
                return;
            }
        }
        System.out.println("\nBoleto " + numeroBoleto + " nao encontrado.");
    }
}

