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
    private double longitude;
    private double latitude;

    public Local(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public abstract double getCusto();
}
