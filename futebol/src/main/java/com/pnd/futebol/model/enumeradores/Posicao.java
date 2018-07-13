/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnd.futebol.model.enumeradores;

/**
 *
 * @author phelipp
 */
public enum Posicao {
    GL("Goleiro"),
    AT("Atacante"),
    MC("Meio Campo"),
    DF("Defesa"),
    LTE("Lateral Esquerdo"),
    LTD("Lateral Direito");

    private final String label;

    private Posicao(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
