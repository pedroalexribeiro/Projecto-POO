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
public abstract class Parque extends Local implements Serializable{
    public Parque(double longitude, double latitude) {
        super(longitude, latitude);
    }    
    
    @Override
    public double getCusto() {
        return 0;
    }
}