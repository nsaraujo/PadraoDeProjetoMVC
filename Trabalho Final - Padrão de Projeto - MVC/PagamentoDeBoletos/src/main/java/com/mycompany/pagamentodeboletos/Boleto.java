/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentodeboletos;


/**
 *
 * @author 55649
 */
public class Boleto {
    private String numero;
    private double valor;
    private boolean pago;

    public Boleto(String numero, double valor) {
        this.numero = numero;
        this.valor = valor;
        this.pago = false;
    }

    public String getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar() {
        this.pago = true;
    }
}


