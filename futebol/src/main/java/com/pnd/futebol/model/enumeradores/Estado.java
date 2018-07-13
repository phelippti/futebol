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
public enum Estado {
   RJ("Rio de Janeiro");
    private final String label;

    private Estado(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
