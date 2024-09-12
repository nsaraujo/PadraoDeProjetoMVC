/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pagamentodeboletos;

/**
 *
 * @author 55649
 */
public class PagamentoDeBoletos {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Nicolas");
        cliente.adicionarBoleto(new Boleto("12345", 250.00));
        cliente.adicionarBoleto(new Boleto("67890", 400.00));

        PagamentoView view = new PagamentoView();
        PagamentoController controller = new PagamentoController(cliente, view);

        controller.exibirBoletos();

        controller.pagarBoleto("12345");
        controller.pagarBoleto("15456");

        controller.exibirBoletos();
 
    }
}
