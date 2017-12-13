/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Bar extends Local implements Serializable{
    private int lotacao;
    private double consumoMinimo;
    private ArrayList<Pessoa> guestlist;

    public Bar(String nome, int lotacao, double consumoMinimo, double longitude, double latitude) {
        super(nome, longitude, latitude);
        this.lotacao = lotacao;
        this.consumoMinimo = consumoMinimo;
        this.guestlist = new ArrayList<>();
    }

    @Override
    public double getCusto() {
        return consumoMinimo;
    }

    @Override
    public String toString() {
        return "Bar: " + getNome() + " -> Número de Inscritos: " + getPessoasInscritas() + " || Lotação: " + lotacao + '.';
    }
    
    
}
