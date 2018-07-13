/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pnd.futebol.model;

import java.util.List;

/**
 *
 * @author phelipp
 */
public class Contribuinte {
    private int id;
    private String nome;
    private String sobrenome;
    private  List<Telefone> telefones ;
    private  List<Despesa> despesas;
    private Endereco endereco;
}
