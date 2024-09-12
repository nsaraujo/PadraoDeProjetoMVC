/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentodeboletos;

import java.util.List;

/**
 *
 * @author 55649
 */
public class PagamentoView {
    public void exibirBoletos(List<Boleto> boletos) {
        System.out.println("Status atualizado dos Boletos: \n");
        for (Boleto boleto : boletos) {
            String status = boleto.isPago() ? "Pago" : "Pendente";
            System.out.println("Boleto: " + boleto.getNumero() + " | Valor: R$" + boleto.getValor() + " | Status: " + status);
        }
    }

    public void exibirConfirmacaoPagamento(String numeroBoleto) {
        System.out.println("Pagamento do boleto " + numeroBoleto + " realizado com sucesso \n");
    }
}

