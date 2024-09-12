/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pagamentodeboletos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
public class Cliente {
    private String nome;
    private List<Boleto> boletos;

    public Cliente(String nome) {
        this.nome = nome;
        this.boletos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarBoleto(Boleto boleto) {
        boletos.add(boleto);
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }
}
