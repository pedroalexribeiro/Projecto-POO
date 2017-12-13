/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public abstract class Local implements Serializable{
    private String nome;
    private double longitude;
    private double latitude;
    private int pessoasInscritas = 0;

    public int getPessoasInscritas() {
        return pessoasInscritas;
    }
    
     protected String getNome() {
        return nome;
    }

    public Local(String nome, double longitude, double latitude) {
        this.nome = nome;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public abstract double getCusto();
}
