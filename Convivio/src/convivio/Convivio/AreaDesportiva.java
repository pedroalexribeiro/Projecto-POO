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
public class AreaDesportiva extends Parque implements Serializable{
    private ArrayList<String> desportosPraticaveis;

    public AreaDesportiva(double longitude, double latitude) {
        super(longitude, latitude);
        this.desportosPraticaveis = new ArrayList<>();
    }  
}